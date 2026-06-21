package com.vk.sdk.api;

import ij.g;
import ij.h;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.k;
import me.n;
import me.o;
import me.p;
import me.t;
import me.u;
import me.v;
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
public final class GsonHolder {

    @NotNull
    public static final GsonHolder INSTANCE = new GsonHolder();

    @NotNull
    private static final g gson$delegate = h.b(GsonHolder$gson$2.INSTANCE);

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class BooleanGsonSerializer implements o, v {
        @Override // me.o
        @Nullable
        public Boolean deserialize(@Nullable p pVar, @Nullable Type type, @Nullable n nVar) {
            if (!(pVar instanceof t)) {
                return null;
            }
            String strE = ((t) pVar).e();
            return Boolean.valueOf(Intrinsics.a(strE, "1") || Intrinsics.a(strE, "true"));
        }

        @Override // me.v
        @NotNull
        public p serialize(@Nullable Boolean bool, @Nullable Type type, @Nullable u uVar) {
            return new t(Integer.valueOf(Intrinsics.a(bool, Boolean.TRUE) ? 1 : 0));
        }
    }

    private GsonHolder() {
    }

    @NotNull
    public final k getGson() {
        Object value = gson$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-gson>(...)");
        return (k) value;
    }
}
