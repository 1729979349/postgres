package com.croky.postgres.web.controller;

import com.croky.postgres.client.model.ItemForm;
import com.croky.postgres.client.model.ItemVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.croky.common.lang.Page;
import com.croky.common.lang.Result;
import com.croky.common.util.ObjectUtils;
import com.croky.postgres.dal.model.Item;
import com.croky.postgres.main.manager.ItemManager;
import com.croky.postgres.web.utils.Helper;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Tag(name = "ItemController", description = "商品相关api")
@RestController
public class ItemController { //implements ItemServiceClient 能够正常运行，但是会当外部请求时导致死循环

	@Autowired
	private ItemManager itemManager;


	@GetMapping("/item/count")
	public Result<Long> getItemCount() {
		return Result.normal(itemManager.getItemCount());
	}

	/*
	 * · header --> 请求参数的获取：@RequestHeader · query --> 请求参数的获取：@RequestParam ·
	 * path（用于restful接口）--> 请求参数的获取：@PathVariable
	 */
	@Operation(summary = "商品清单", description = "根据页码和页大小获取商品的清单")
	@Parameters({
			@Parameter(name = "pageNum", description = "页码", required = false),
			@Parameter(name = "pageSize", description = "页大小", required = false) })
	@GetMapping("/item/list")
	public Result<Page<ItemVO>> getItems(@RequestParam(value="pageNum", defaultValue = "1", required = false) int pageNum, // 页码
										 @RequestParam(value="pageSize", defaultValue = "20", required = false) int pageSize) {
		try {
			return Result.normal(Helper.convertPageInfo(itemManager.getItems(pageNum, pageSize), ItemVO.class));
		} catch (Exception e) {
			return Result.error(e.getMessage());
		}
	}

	@Operation(summary = "获取商品信息", description = "根据商品id获取商品")
	@GetMapping("/item/get/{id}")
	public Result<ItemVO> getItemById(long id) {
		Item item = itemManager.getItem(id);
		if (null != item) {
			return Result.normal(ObjectUtils.convert(item, ItemVO.class));
		} else {
			return Result.normal();
		}
	}

	
	@Operation(summary = "发布商品", description = "填写相关信息将商品写入到商品库中")
	//转化icon
	@Parameters({
		//@ApiImplicitParam(paramType = "form", name = "itemForm",value = "商品实例", required = false),
		//用这种方式代替form中的文件对象,paramType = "form", dataType="__file",
		@Parameter(name = "iconFiles",description = "商品图标")
	})
	@PostMapping(value = "/item/release",consumes="multipart/*",headers="content-type=multipart/form-data")//application/json,multipart/form-data
	public Result<Object> releaseItem(ItemForm itemForm,@RequestPart List<MultipartFile> iconFiles) {
		if (null != itemForm) {
			Item item = ObjectUtils.convert(itemForm, Item.class);
			itemManager.addOrUpdate(item);
		}
		return Result.normal();
	}

	@Operation(summary = "删除商品", description = "根据商品id删除商品")
	@DeleteMapping("/item/delete/{id}")
	public Result<ItemVO> deleteItem(long id) {
		Item item = itemManager.deleteItem(id);
		return Result.normal(ObjectUtils.convert(item,ItemVO.class));
	}
}
