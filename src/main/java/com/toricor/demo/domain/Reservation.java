package com.toricor.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity // JPAのEntity
@Table(name = "reservation") // デフォルトではテーブル名 = クラス名
@Data
@NoArgsConstructor // JPAの仕様でエンティティクラスには引数のないデフォルトコンストラクタを作る必要がある
@AllArgsConstructor // JPAとは関係ないが便利なので全フィールドを引数にもつコンストラクタも生成させる
public class Reservation {
    @Id // エンティティの主キーにつける
    @GeneratedValue // 主キーがDBで自動採番されることを示す
    private Integer id;
    @Column(nullable = false)
    private Integer user_id;
    @Column(nullable = false)
    private Integer event_id;
}
