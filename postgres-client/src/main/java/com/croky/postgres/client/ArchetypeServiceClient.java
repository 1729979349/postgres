package com.croky.postgres.client;

import com.croky.postgres.client.model.ItemVO;
import com.croky.postgres.client.model.ItemForm;
import com.croky.common.lang.Page;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.croky.postgres.client.fallback.ArchetypeServiceClientFallBack;
import com.croky.common.lang.Result;

@FeignClient(name = "https://postgres", fallback = ArchetypeServiceClientFallBack.class) //, url = "http://www.yaofanbao.com:8080"
//@RequestMapping("") //如果与Controller中的不一致会出现错误
public interface ArchetypeServiceClient {

	@GetMapping("/item/count")
	Result<Long> getItemCount();
	
	@GetMapping("/item/list")
	Result<Page<ItemVO>> getItems(@RequestParam(value="pageNum", defaultValue = "1", required = false) int pageNum, // 页码
								  @RequestParam(value="pageSize", defaultValue = "20", required = false) int pageSize);
	
	@GetMapping("/item/get/{id}")
	Result<ItemVO> getItemById(@PathVariable(value = "id") long id);
	
	@PostMapping(value = "/item/release",consumes="multipart/*",headers="content-type=multipart/form-data")//application/json,multipart/form-data
	Result<Object> releaseItem(@RequestBody ItemForm itemForm);
	
	@DeleteMapping("/item/delete/{id}")
	Result<ItemVO> deleteItem(@PathVariable(value = "id") long id);
}
