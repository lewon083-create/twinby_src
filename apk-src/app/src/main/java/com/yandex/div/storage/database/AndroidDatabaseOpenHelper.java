package com.yandex.div.storage.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import com.yandex.div.internal.Assert;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
public class AndroidDatabaseOpenHelper implements DatabaseOpenHelper {

    @NotNull
    private final DatabaseManager databaseManager;

    @NotNull
    private final SQLiteOpenHelper mSQLiteOpenHelper;

    @NotNull
    private final Object mOpenCloseLock = new Object();

    @NotNull
    private final Map<SQLiteDatabase, OpenCloseInfo> mOpenCloseInfoMap = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public final class AndroidSQLiteDatabase implements DatabaseOpenHelper.Database {

        @NotNull
        private final SQLiteDatabase mDb;

        @NotNull
        private final OpenCloseInfo mOpenCloseInfo;

        public AndroidSQLiteDatabase(@NotNull SQLiteDatabase sQLiteDatabase, @NotNull OpenCloseInfo openCloseInfo) {
            this.mDb = sQLiteDatabase;
            this.mOpenCloseInfo = openCloseInfo;
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void beginTransaction() {
            this.mDb.beginTransaction();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            AndroidDatabaseOpenHelper.this.databaseManager.closeDatabase(this.mDb);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        @NotNull
        public SQLiteStatement compileStatement(@NotNull String str) {
            return this.mDb.compileStatement(str);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void endTransaction() {
            this.mDb.endTransaction();
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void execSQL(@NotNull String str) {
            this.mDb.execSQL(str);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        @NotNull
        public Cursor rawQuery(@NotNull String str, @Nullable String[] strArr) {
            return this.mDb.rawQuery(str, strArr);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void setTransactionSuccessful() {
            this.mDb.setTransactionSuccessful();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class DatabaseManager {

        @NotNull
        private final SQLiteOpenHelper databaseHelper;

        @Nullable
        private SQLiteDatabase readableDatabase;
        private int readableUsersCount;

        @Nullable
        private SQLiteDatabase writableDatabase;
        private int writableUsersCount;

        @NotNull
        private final Set<Thread> readableUsers = new LinkedHashSet();

        @NotNull
        private final Set<Thread> writableUsers = new LinkedHashSet();

        public DatabaseManager(@NotNull SQLiteOpenHelper sQLiteOpenHelper) {
            this.databaseHelper = sQLiteOpenHelper;
        }

        public final synchronized void closeDatabase(@NotNull SQLiteDatabase sQLiteDatabase) {
            try {
                if (Intrinsics.a(sQLiteDatabase, this.writableDatabase)) {
                    this.writableUsers.remove(Thread.currentThread());
                    if (this.writableUsers.isEmpty()) {
                        while (true) {
                            int i = this.writableUsersCount;
                            this.writableUsersCount = i - 1;
                            if (i <= 0) {
                                break;
                            }
                            SQLiteDatabase sQLiteDatabase2 = this.writableDatabase;
                            Intrinsics.b(sQLiteDatabase2);
                            sQLiteDatabase2.close();
                        }
                    }
                } else if (Intrinsics.a(sQLiteDatabase, this.readableDatabase)) {
                    this.readableUsers.remove(Thread.currentThread());
                    if (this.readableUsers.isEmpty()) {
                        while (true) {
                            int i10 = this.readableUsersCount;
                            this.readableUsersCount = i10 - 1;
                            if (i10 <= 0) {
                                break;
                            }
                            SQLiteDatabase sQLiteDatabase3 = this.readableDatabase;
                            Intrinsics.b(sQLiteDatabase3);
                            sQLiteDatabase3.close();
                        }
                    }
                } else {
                    Assert.fail("Trying to close unknown database from DatabaseManager");
                    sQLiteDatabase.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @NotNull
        public final synchronized SQLiteDatabase openWritableDatabase() {
            SQLiteDatabase sQLiteDatabase;
            this.writableDatabase = this.databaseHelper.getWritableDatabase();
            this.writableUsersCount++;
            this.writableUsers.add(Thread.currentThread());
            sQLiteDatabase = this.writableDatabase;
            Intrinsics.b(sQLiteDatabase);
            return sQLiteDatabase;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class OpenCloseInfo {
        private int currentlyOpenedCount;

        public final int getCurrentlyOpenedCount() {
            return this.currentlyOpenedCount;
        }

        public final void setCurrentlyOpenedCount(int i) {
            this.currentlyOpenedCount = i;
        }
    }

    public AndroidDatabaseOpenHelper(@NotNull Context context, @NotNull String str, int i, @NotNull final DatabaseOpenHelper.CreateCallback createCallback, @NotNull final DatabaseOpenHelper.UpgradeCallback upgradeCallback) {
        SQLiteOpenHelper sQLiteOpenHelper = new SQLiteOpenHelper(context, str, i) { // from class: com.yandex.div.storage.database.AndroidDatabaseOpenHelper.1
            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onConfigure(@NotNull SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onCreate(@NotNull SQLiteDatabase sQLiteDatabase) {
                createCallback.onCreate(this.wrapDataBase(sQLiteDatabase));
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onUpgrade(@NotNull SQLiteDatabase sQLiteDatabase, int i10, int i11) {
                upgradeCallback.onUpgrade(this.wrapDataBase(sQLiteDatabase), i10, i11);
            }
        };
        this.mSQLiteOpenHelper = sQLiteOpenHelper;
        this.databaseManager = new DatabaseManager(sQLiteOpenHelper);
    }

    private OpenCloseInfo getOpenCloseInfo(SQLiteDatabase sQLiteDatabase) {
        OpenCloseInfo openCloseInfo;
        synchronized (this.mOpenCloseLock) {
            try {
                openCloseInfo = this.mOpenCloseInfoMap.get(sQLiteDatabase);
                if (openCloseInfo == null) {
                    openCloseInfo = new OpenCloseInfo();
                    this.mOpenCloseInfoMap.put(sQLiteDatabase, openCloseInfo);
                }
                openCloseInfo.setCurrentlyOpenedCount(openCloseInfo.getCurrentlyOpenedCount() + 1);
                openCloseInfo.getCurrentlyOpenedCount();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return openCloseInfo;
    }

    @Override // com.yandex.div.storage.database.DatabaseOpenHelper
    @NotNull
    public DatabaseOpenHelper.Database getWritableDatabase() {
        return wrapDataBase(this.databaseManager.openWritableDatabase());
    }

    @NotNull
    public DatabaseOpenHelper.Database wrapDataBase(@NotNull SQLiteDatabase sQLiteDatabase) {
        return new AndroidSQLiteDatabase(sQLiteDatabase, getOpenCloseInfo(sQLiteDatabase));
    }
}
