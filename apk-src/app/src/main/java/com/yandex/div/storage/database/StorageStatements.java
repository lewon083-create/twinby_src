package com.yandex.div.storage.database;

import android.database.Cursor;
import hl.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
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
public final class StorageStatements {

    @NotNull
    public static final StorageStatements INSTANCE = new StorageStatements();

    private StorageStatements() {
    }

    @NotNull
    public final StorageStatement dropAllTables() {
        return new StorageStatement() { // from class: com.yandex.div.storage.database.StorageStatements.dropAllTables.1
            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(@NotNull SqlCompiler sqlCompiler) throws IOException {
                ArrayList arrayList = new ArrayList();
                ReadState readStateCompileQuery = sqlCompiler.compileQuery("SELECT name FROM sqlite_master WHERE type='table'", new String[0]);
                try {
                    Cursor cursor = readStateCompileQuery.getCursor();
                    if (!cursor.moveToFirst()) {
                        l.g(readStateCompileQuery, null);
                        return;
                    }
                    do {
                        arrayList.add(cursor.getString(cursor.getColumnIndexOrThrow("name")));
                    } while (cursor.moveToNext());
                    Unit unit = Unit.f27471a;
                    l.g(readStateCompileQuery, null);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        sqlCompiler.compileStatement("DROP TABLE IF EXISTS " + ((String) it.next())).execute();
                    }
                } finally {
                }
            }

            @NotNull
            public String toString() {
                return "Drop all database tables";
            }
        };
    }
}
