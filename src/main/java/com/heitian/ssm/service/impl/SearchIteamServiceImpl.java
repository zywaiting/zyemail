package com.heitian.ssm.service.impl;

import com.heitian.ssm.mapping.SearchIteamMapper;
import com.heitian.ssm.model.SearchItem;
import com.heitian.ssm.service.SearchIteamService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SearchIteamServiceImpl implements SearchIteamService {

    @Resource
    private SearchIteamMapper searchIteamMapper;

    public List<SearchItem> getAllIteam() {

        return searchIteamMapper.getItemList();
    }
}
