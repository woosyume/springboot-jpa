package com.rakuten.internship.service;

import java.util.List;

import com.rakuten.internship.entity.Todo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * このクラスは、データベースとのトランザクションをサポートするサービスクラスです。。
 */
@Service
@Transactional
public class TodoService {

    // TODO 必要なメンバーを宣言してください。

    public List<Todo> findTodos(){
        // TODO 必要なコードを作成してください。
        return null;
    }

    public Todo save(Todo todo) {
        // TODO 必要なコードを作成してください。
        return null;
    }
}