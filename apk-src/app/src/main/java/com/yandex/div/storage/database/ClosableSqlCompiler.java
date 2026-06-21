package com.yandex.div.storage.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import com.yandex.div.storage.util.SqlExtensionsKt;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
final class ClosableSqlCompiler implements SqlCompiler, Closeable {

    /* JADX INFO: renamed from: db, reason: collision with root package name */
    @NotNull
    private final DatabaseOpenHelper.Database f15268db;

    @NotNull
    private final List<SQLiteStatement> createdStatements = new ArrayList();

    @NotNull
    private final List<Cursor> createdCursors = new ArrayList();

    public ClosableSqlCompiler(@NotNull DatabaseOpenHelper.Database database) {
        this.f15268db = database;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor compileQuery$lambda$2(ClosableSqlCompiler closableSqlCompiler, String str, String[] strArr) {
        Cursor cursorRawQuery = closableSqlCompiler.f15268db.rawQuery(str, strArr);
        closableSqlCompiler.createdCursors.add(cursorRawQuery);
        return cursorRawQuery;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Iterator<T> it = this.createdStatements.iterator();
        while (it.hasNext()) {
            SqlExtensionsKt.closeSilently((SQLiteStatement) it.next());
        }
        this.createdStatements.clear();
        for (Cursor cursor : this.createdCursors) {
            if (!cursor.isClosed()) {
                SqlExtensionsKt.closeSilently(cursor);
            }
        }
        this.createdCursors.clear();
    }

    @Override // com.yandex.div.storage.database.SqlCompiler
    @NotNull
    public ReadState compileQuery(@NotNull final String str, @NotNull final String... strArr) {
        return new ReadState(null, new hj.a() { // from class: com.yandex.div.storage.database.a
            @Override // hj.a
            public final Object get() {
                return ClosableSqlCompiler.compileQuery$lambda$2(this.f15269a, str, strArr);
            }
        }, 1, null);
    }

    @Override // com.yandex.div.storage.database.SqlCompiler
    @NotNull
    public SQLiteStatement compileStatement(@NotNull String str) {
        SQLiteStatement sQLiteStatementCompileStatement = this.f15268db.compileStatement(str);
        this.createdStatements.add(sQLiteStatementCompileStatement);
        return sQLiteStatementCompileStatement;
    }
}
