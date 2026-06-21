package com.yandex.div.storage;

import android.content.Context;
import android.database.SQLException;
import com.google.android.gms.internal.ads.om1;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.storage.DivStorageComponent;
import com.yandex.div.storage.DivStorageImpl;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import com.yandex.div.storage.database.DatabaseOpenHelperProvider;
import com.yandex.div.storage.database.Migration;
import com.yandex.div.storage.database.SingleTransactionDataSavePerformer;
import com.yandex.div.storage.database.StorageStatementExecutor;
import com.yandex.div.storage.database.StorageStatements;
import e5.g;
import eh.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public class DivStorageImpl implements DivStorage {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final SingleTransactionDataSavePerformer dataSaveUseCase;

    @NotNull
    private final String dbName;

    @NotNull
    private final Migration defaultDropAllMigration;

    @NotNull
    private final Map<Pair<Integer, Integer>, Migration> migrations;

    @NotNull
    private final DatabaseOpenHelper openHelper;

    @NotNull
    private final StorageStatementExecutor statementExecutor;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.storage.DivStorageImpl$dropTables$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass1 extends r implements Function0<DatabaseOpenHelper.Database> {
        final /* synthetic */ DatabaseOpenHelper.Database $db;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DatabaseOpenHelper.Database database) {
            super(0);
            this.$db = database;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final DatabaseOpenHelper.Database invoke() {
            return this.$db;
        }
    }

    public DivStorageImpl(@NotNull Context context, @NotNull DatabaseOpenHelperProvider databaseOpenHelperProvider, @NotNull String str) {
        String strConcat = str.length() == 0 ? "div-storage.db" : str.concat("-div-storage.db");
        this.dbName = strConcat;
        DivStorageImpl$openHelper$1 divStorageImpl$openHelper$1 = new DivStorageImpl$openHelper$1(this);
        DivStorageImpl$openHelper$2 divStorageImpl$openHelper$2 = new DivStorageImpl$openHelper$2(this);
        ((g) databaseOpenHelperProvider).getClass();
        this.openHelper = DivStorageComponent.Companion.createInternal$lambda$0(context, strConcat, 3, divStorageImpl$openHelper$1, divStorageImpl$openHelper$2);
        this.statementExecutor = new StorageStatementExecutor(new DivStorageImpl$statementExecutor$1(this));
        this.dataSaveUseCase = new SingleTransactionDataSavePerformer(getStatementExecutor());
        this.migrations = i0.c(new Pair(new Pair(2, 3), new a()));
        this.defaultDropAllMigration = new Migration() { // from class: eh.b
            @Override // com.yandex.div.storage.database.Migration
            public final void migrate(DatabaseOpenHelper.Database database) {
                DivStorageImpl.defaultDropAllMigration$lambda$1(this.f16380a, database);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void defaultDropAllMigration$lambda$1(DivStorageImpl divStorageImpl, DatabaseOpenHelper.Database database) {
        divStorageImpl.dropTables(database);
        divStorageImpl.createTables(database);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void migrations$lambda$0(DatabaseOpenHelper.Database database) {
        try {
            database.execSQL("\n    CREATE TABLE IF NOT EXISTS raw_json(\n    raw_json_id TEXT NOT NULL PRIMARY KEY,\n    raw_json_data BLOB NULLABLE)");
        } catch (SQLException e3) {
            throw new SQLException("Create \"raw_json\" table", e3);
        }
    }

    public void createTables(@NotNull DatabaseOpenHelper.Database database) {
        try {
            database.execSQL("\n    CREATE TABLE IF NOT EXISTS cards(\n    layout_id TEXT NOT NULL PRIMARY KEY,\n    card_data BLOB NULLABLE,\n    metadata BLOB NULLABLE,\n    group_id TEXT NOT NULL)");
            database.execSQL("\n    CREATE TABLE IF NOT EXISTS template_references(\n    group_id TEXT NOT NULL,\n    template_id TEXT NOT NULL,\n    template_hash TEXT NOT NULL,\n    PRIMARY KEY(group_id, template_id))");
            database.execSQL("\n    CREATE TABLE IF NOT EXISTS templates(\n    template_hash TEXT NOT NULL PRIMARY KEY,\n    template_data BLOB NULLABLE)");
            database.execSQL("\n    CREATE TABLE IF NOT EXISTS raw_json(\n    raw_json_id TEXT NOT NULL PRIMARY KEY,\n    raw_json_data BLOB NULLABLE)");
        } catch (SQLException e3) {
            throw new SQLException("Create tables", e3);
        }
    }

    public void dropTables(@NotNull DatabaseOpenHelper.Database database) {
        new StorageStatementExecutor(new AnonymousClass1(database)).execute(StorageStatements.INSTANCE.dropAllTables());
    }

    @NotNull
    public Map<Pair<Integer, Integer>, Migration> getMigrations() {
        return this.migrations;
    }

    @NotNull
    public StorageStatementExecutor getStatementExecutor() {
        return this.statementExecutor;
    }

    public void onCreate(@NotNull DatabaseOpenHelper.Database database) {
        createTables(database);
    }

    public void onUpgrade(@NotNull DatabaseOpenHelper.Database database, int i, int i10) {
        KAssert kAssert = KAssert.INSTANCE;
        Integer numValueOf = Integer.valueOf(i10);
        if (Assert.isEnabled()) {
            Assert.assertEquals("", numValueOf, 3);
        }
        if (i == 3) {
            return;
        }
        Migration migration = getMigrations().get(new Pair(Integer.valueOf(i), Integer.valueOf(i10)));
        if (migration == null) {
            migration = this.defaultDropAllMigration;
        }
        try {
            migration.migrate(database);
        } catch (SQLException e3) {
            if (Assert.isEnabled()) {
                Assert.fail(om1.j("Migration from ", i, " to ", i10, " throws exception"), e3);
            }
            this.defaultDropAllMigration.migrate(database);
        }
    }
}
