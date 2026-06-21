package com.yandex.div.storage;

import com.yandex.div.storage.database.DatabaseOpenHelper;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.p;
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
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public /* synthetic */ class DivStorageImpl$openHelper$2 implements DatabaseOpenHelper.UpgradeCallback, m {
    final /* synthetic */ DivStorageImpl $tmp0;

    public DivStorageImpl$openHelper$2(DivStorageImpl divStorageImpl) {
        this.$tmp0 = divStorageImpl;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof DatabaseOpenHelper.UpgradeCallback) && (obj instanceof m)) {
            return Intrinsics.a(getFunctionDelegate(), ((m) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.m
    @NotNull
    public final Function getFunctionDelegate() {
        return new p(3, this.$tmp0, DivStorageImpl.class, "onUpgrade", "onUpgrade(Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;II)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.yandex.div.storage.database.DatabaseOpenHelper.UpgradeCallback
    public final void onUpgrade(@NotNull DatabaseOpenHelper.Database database, int i, int i10) {
        this.$tmp0.onUpgrade(database, i, i10);
    }
}
