package com.vk.api.sdk;

import com.vk.api.sdk.okhttp.UserAgentInterceptor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import zk.t;
import zk.u;

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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public abstract class VKOkHttpProvider {

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public interface BuilderUpdateFunction {
        t update(t tVar);
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class DefaultProvider extends VKOkHttpProvider {
        private volatile u okHttpClient;

        @Override // com.vk.api.sdk.VKOkHttpProvider
        public u getClient() {
            if (this.okHttpClient == null) {
                t tVar = new t();
                TimeUnit unit = TimeUnit.SECONDS;
                Intrinsics.checkNotNullParameter(unit, "unit");
                tVar.f46470v = al.b.b(20L);
                Intrinsics.checkNotNullParameter(unit, "unit");
                tVar.f46471w = al.b.b(30L);
                Intrinsics.checkNotNullParameter(unit, "unit");
                tVar.f46472x = al.b.b(20L);
                tVar.f46457h = true;
                tVar.i = true;
                UserAgentInterceptor interceptor = new UserAgentInterceptor(VK.INSTANCE.getSDKUserAgent$core_release());
                Intrinsics.checkNotNullParameter(interceptor, "interceptor");
                tVar.f46452c.add(interceptor);
                this.okHttpClient = new u(tVar);
            }
            u uVar = this.okHttpClient;
            Intrinsics.b(uVar);
            return uVar;
        }

        @Override // com.vk.api.sdk.VKOkHttpProvider
        public void updateClient(BuilderUpdateFunction f10) {
            Intrinsics.checkNotNullParameter(f10, "f");
            u okHttpClient = getClient();
            okHttpClient.getClass();
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            t tVar = new t();
            tVar.f46450a = okHttpClient.f46475b;
            tVar.f46451b = okHttpClient.f46476c;
            x.m(tVar.f46452c, okHttpClient.f46477d);
            x.m(tVar.f46453d, okHttpClient.f46478e);
            tVar.f46454e = okHttpClient.f46479f;
            tVar.f46455f = okHttpClient.f46480g;
            tVar.f46456g = okHttpClient.f46481h;
            tVar.f46457h = okHttpClient.i;
            tVar.i = okHttpClient.f46482j;
            tVar.f46458j = okHttpClient.f46483k;
            tVar.f46459k = okHttpClient.f46484l;
            tVar.f46460l = okHttpClient.f46485m;
            tVar.f46461m = okHttpClient.f46486n;
            tVar.f46462n = okHttpClient.f46487o;
            tVar.f46463o = okHttpClient.f46488p;
            tVar.f46464p = okHttpClient.f46489q;
            tVar.f46465q = okHttpClient.f46490r;
            tVar.f46466r = okHttpClient.f46491s;
            tVar.f46467s = okHttpClient.f46492t;
            tVar.f46468t = okHttpClient.f46493u;
            tVar.f46469u = okHttpClient.f46494v;
            tVar.f46470v = okHttpClient.f46495w;
            tVar.f46471w = okHttpClient.f46496x;
            tVar.f46472x = okHttpClient.f46497y;
            tVar.f46473y = okHttpClient.f46498z;
            tVar.f46474z = okHttpClient.A;
            t tVarUpdate = f10.update(tVar);
            tVarUpdate.getClass();
            this.okHttpClient = new u(tVarUpdate);
        }
    }

    public abstract u getClient();

    public abstract void updateClient(BuilderUpdateFunction builderUpdateFunction);
}
