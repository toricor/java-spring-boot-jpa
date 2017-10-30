package com.toricor.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.joda.time.LocalDateTime;

import javax.persistence.*;

@Entity // JPAのEntity
@Table(name = "event") // デフォルトではテーブル名 = クラス名
@Data
@NoArgsConstructor // JPAの仕様でエンティティクラスには引数のないデフォルトコンストラクタを作る必要がある
@AllArgsConstructor // JPAとは関係ないが便利なので全フィールドを引数にもつコンストラクタも生成させる
public class Event {
    @Id // エンティティの主キーにつける
    @GeneratedValue // 主キーがDBで自動採番されることを示す
    private Integer id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private Integer author;
    @Column(nullable = false)
    private String place;
    @Column(nullable = false)
    private Integer participants;
    @Column(nullable = false)
    private Integer maxParticipants;
    @Column(nullable = false)
    private LocalDateTime publishedAt;
    private LocalDateTime createdAt;
}
