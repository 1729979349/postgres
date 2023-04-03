package com.croky.postgres.client.fallback;

import com.croky.postgres.client.utils.Constants;
import com.croky.postgres.client.model.ItemVO;
import com.croky.postgres.client.model.ItemForm;
import com.croky.common.lang.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.croky.postgres.client.ArchetypeServiceClient;
import com.croky.common.lang.Result;

/**
 * 
 * @author Croky
 * @date 2020-9-5 16:51:20
 */
@Service
public class ArchetypeServiceClientFallBack implements ArchetypeServiceClient {
	private static final Logger log = LoggerFactory.getLogger(ArchetypeServiceClientFallBack.class);
	@Override
	public Result<Long> getItemCount() {
		log.error("getItemCount:" + Constants.NotifyMessage);
		return Result.error(Constants.NotifyMessage);
	}

	@Override
	public Result<Page<ItemVO>> getItems(int pageNo, int pageSize) {
		log.error("getItems:" + Constants.NotifyMessage);
		return Result.error(Constants.NotifyMessage);
	}

	@Override
	public Result<ItemVO> getItemById(long id) {
		log.error("getItemById:" + Constants.NotifyMessage);
		return Result.error(Constants.NotifyMessage);
	}

	@Override
	public Result<Object> releaseItem(ItemForm itemForm) {
		log.error("releaseItem:" + Constants.NotifyMessage);
		return Result.error(Constants.NotifyMessage);
	}

	@Override
	public Result<ItemVO> deleteItem(long id) {
		log.error("deleteItem:" + Constants.NotifyMessage);
		return Result.error(Constants.NotifyMessage);
	}

}
