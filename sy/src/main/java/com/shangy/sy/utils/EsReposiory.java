package com.shangy.sy.utils;

import com.shangy.sy.entity.FileBeat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

public interface EsReposiory extends CrudRepository<FileBeat, String> {
}
