package com.vk.api.sdk.utils;

import com.vk.api.sdk.VKOkHttpProvider;
import dl.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import zk.f0;
import zk.u;
import zk.w;
import zk.x;

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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class VKLoader {
    public static final VKLoader INSTANCE = new VKLoader();

    private VKLoader() {
    }

    public final byte[] load(String url) {
        Throwable th2;
        f0 f0Var;
        Intrinsics.checkNotNullParameter(url, "url");
        byte[] bArrA = null;
        try {
            w wVar = new w();
            wVar.f(url);
            x request = wVar.a();
            u client = new VKOkHttpProvider.DefaultProvider().getClient();
            client.getClass();
            Intrinsics.checkNotNullParameter(request, "request");
            f0Var = new g(client, request).c().f46352h;
            if (f0Var != null) {
                try {
                    bArrA = f0Var.a();
                } catch (Exception unused) {
                    if (f0Var != null) {
                        f0Var.close();
                    }
                    return null;
                } catch (Throwable th3) {
                    th2 = th3;
                    if (f0Var != null) {
                        f0Var.close();
                    }
                    throw th2;
                }
            }
            if (f0Var == null) {
                return bArrA;
            }
            f0Var.close();
            return bArrA;
        } catch (Exception unused2) {
            f0Var = null;
        } catch (Throwable th4) {
            th2 = th4;
            f0Var = null;
        }
    }
}
