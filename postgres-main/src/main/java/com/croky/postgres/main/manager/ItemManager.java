package com.croky.postgres.main.manager;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import java.util.List;

import com.croky.postgres.dal.model.Item;
import com.croky.postgres.main.model.Status;

public interface ItemManager {

	long getItemCount();

	PageInfo<Item> getItems(int pageNum, int pageSize);

	Item getItem(long id);

	List<Item> queryItems(int pageNum, int pageSize);

	Item insertItem(String barcode, String name, String pinyin);

	int updateItemStatus(long id, Status status);

	Item deleteItem(long id);

	Item addOrUpdate(Item item);

	Page<Item> getItemsByLocation(String location, int pageNum, int pageSize);

}
