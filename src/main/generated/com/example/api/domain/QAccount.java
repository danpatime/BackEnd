package com.example.api.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAccount is a Querydsl query type for Account
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAccount extends EntityPathBase<Account> {

    private static final long serialVersionUID = -1087167288L;

    public static final QAccount account = new QAccount("account");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final NumberPath<Long> accountId = createNumber("accountId", Long.class);

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final BooleanPath deleted = createBoolean("deleted");

    public final StringPath email = createString("email");

    public final StringPath loginId = createString("loginId");

    public final StringPath name = createString("name");

    public final StringPath nickname = createString("nickname");

    public final BooleanPath openStatus = createBoolean("openStatus");

    public final StringPath password = createString("password");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final StringPath profileImage = createString("profileImage");

    public final DateTimePath<java.util.Date> registeredDatetime = createDateTime("registeredDatetime", java.util.Date.class);

    public final StringPath sex = createString("sex");

    public final NumberPath<Float> starPoint = createNumber("starPoint", Float.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public final NumberPath<Integer> workCount = createNumber("workCount", Integer.class);

    public QAccount(String variable) {
        super(Account.class, forVariable(variable));
    }

    public QAccount(Path<? extends Account> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAccount(PathMetadata metadata) {
        super(Account.class, metadata);
    }

}
