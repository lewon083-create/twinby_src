package com.yandex.varioqub.appmetricaadapter;

import android.content.Context;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.analyticadapter.data.ConfigData;
import com.yandex.varioqub.appmetricaadapter.impl.c;
import com.yandex.varioqub.appmetricaadapter.impl.d;
import com.yandex.varioqub.appmetricaadapter.impl.f;
import com.yandex.varioqub.appmetricaadapter.impl.i;
import com.yandex.varioqub.appmetricaadapter.impl.j;
import com.yandex.varioqub.appmetricaadapter.impl.k;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;

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
public final class AppMetricaAdapter implements VarioqubConfigAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f15320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f15322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15323e;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i) {
            this();
        }
    }

    static {
        new Companion(0);
    }

    public AppMetricaAdapter(Context context) {
        Class<?> cls;
        d iVar;
        this.f15319a = context;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("io.appmetrica.analytics.AppMetrica", false, j.class.getClassLoader());
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            iVar = new c();
        } else {
            try {
                cls2 = Class.forName("com.yandex.metrica.YandexMetrica", false, j.class.getClassLoader());
            } catch (Throwable unused2) {
            }
            iVar = cls2 != null ? new i() : new f();
        }
        this.f15320b = iVar;
        this.f15321c = "";
        this.f15322d = d0.f27478b;
        this.f15323e = "AppMetricaAdapter";
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter
    public final String getAdapterName() {
        return this.f15323e;
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public final void reportConfigChanged(ConfigData configData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("old_config", configData.getOldConfigVersion());
        linkedHashMap.put("new_config", configData.getNewConfigVersion());
        linkedHashMap.put("timestamp", Long.valueOf(configData.getConfigLoadTimestamp()));
        this.f15320b.b(linkedHashMap);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
    public final void requestDeviceId(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f15320b.c(this.f15319a, adapterIdentifiersCallback);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
    public final void requestUserId(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f15320b.a(this.f15319a, adapterIdentifiersCallback);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public final void setExperiments(String str) {
        this.f15321c = str;
        Objects.toString(this.f15322d);
        k kVar = new k();
        kVar.f15329o = this.f15321c;
        kVar.f15330p = CollectionsKt.S(this.f15322d);
        this.f15320b.a(MessageNano.toByteArray(kVar));
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public final void setTriggeredTestIds(Set set) {
        Objects.toString(set);
        Set setV = CollectionsKt.V(set);
        this.f15322d = setV;
        Objects.toString(setV);
        k kVar = new k();
        kVar.f15329o = this.f15321c;
        kVar.f15330p = CollectionsKt.S(this.f15322d);
        this.f15320b.a(MessageNano.toByteArray(kVar));
    }
}
