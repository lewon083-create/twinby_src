package ef;

import a0.a0;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.MobileAds;
import com.yandex.mobile.ads.nativeads.NativeAdLoader;
import com.yandex.mobile.ads.nativeads.NativeAdRequestConfiguration;
import ii.h;
import ii.i;
import ii.o;
import ii.p;
import ii.q;
import io.flutter.plugin.platform.n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.j0;
import kotlin.jvm.internal.Intrinsics;

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
public final class c implements ei.b, o, h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final LinkedHashMap f16361l = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f16362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f16363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f16364d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile ii.g f16367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16368h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f16369j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f16365e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f16366f = new LinkedHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f16370k = new ArrayList();

    @Override // ii.h
    public final void e(Object obj, ii.g gVar) {
        this.f16367g = gVar;
    }

    @Override // ii.h
    public final void k(Object obj) {
        this.f16367g = null;
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f16364d = binding.f16381a;
        ii.f fVar = binding.f16383c;
        q qVar = new q(fVar, "com.twinby.flutter_yandex_ad/methods");
        this.f16362b = qVar;
        qVar.b(this);
        i iVar = new i(fVar, "com.twinby.flutter_yandex_ad/events");
        this.f16363c = iVar;
        iVar.a(this);
        n nVar = binding.f16385e;
        Context context = this.f16364d;
        if (context == null) {
            Intrinsics.g("appContext");
            throw null;
        }
        nVar.h("com.twinby.flutter_yandex_ad/native", new f(context, new b(1, this, c.class, "nativeAdForId", "nativeAdForId(Ljava/lang/String;)Lcom/yandex/mobile/ads/nativeads/NativeAd;", 0, 0)));
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        q qVar = this.f16362b;
        if (qVar == null) {
            Intrinsics.g("methodChannel");
            throw null;
        }
        qVar.b(null);
        i iVar = this.f16363c;
        if (iVar == null) {
            Intrinsics.g("eventChannel");
            throw null;
        }
        iVar.a(null);
        this.f16367g = null;
        for (e eVar : this.f16366f.values()) {
            NativeAdLoader nativeAdLoader = eVar.f16375c;
            if (nativeAdLoader != null) {
                nativeAdLoader.cancelLoading();
            }
            eVar.f16376d = false;
            eVar.f16377e = null;
            eVar.f16375c = null;
        }
        this.f16366f.clear();
    }

    @Override // ii.o
    public final void onMethodCall(ii.n call, p result) {
        e eVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.f21315a;
        int iHashCode = str.hashCode();
        LinkedHashMap linkedHashMap = this.f16366f;
        if (iHashCode != 573800264) {
            if (iHashCode != 871091088) {
                if (iHashCode == 1705649245 && str.equals("native.load")) {
                    String str2 = (String) call.a("id");
                    String adUnitId = (String) call.a("adUnitId");
                    if (str2 == null || adUnitId == null) {
                        ((hi.g) result).b("bad_args", "Missing native ad id or ad unit id.", null);
                        return;
                    }
                    Number number = (Number) call.a("width");
                    long jLongValue = number != null ? number.longValue() : 0L;
                    Number number2 = (Number) call.a("height");
                    long jLongValue2 = number2 != null ? number2.longValue() : 0L;
                    Object eVar2 = linkedHashMap.get(str2);
                    if (eVar2 == null) {
                        Context context = this.f16364d;
                        if (context == null) {
                            Intrinsics.g("appContext");
                            throw null;
                        }
                        eVar2 = new e(str2, context, new a(this, str2));
                        linkedHashMap.put(str2, eVar2);
                    }
                    e eVar3 = (e) eVar2;
                    Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
                    if (!eVar3.f16376d && eVar3.f16377e == null) {
                        eVar3.f16376d = true;
                        NativeAdLoader nativeAdLoader = new NativeAdLoader(eVar3.f16373a);
                        eVar3.f16375c = nativeAdLoader;
                        nativeAdLoader.setNativeAdLoadListener(new a1.e(20, eVar3, nativeAdLoader, false));
                        NativeAdRequestConfiguration.Builder builder = new NativeAdRequestConfiguration.Builder(adUnitId);
                        Map<String, String> mapG = (jLongValue > 0 || jLongValue2 > 0) ? j0.g(new Pair("preferable-width", String.valueOf(jLongValue)), new Pair("preferable-height", String.valueOf(jLongValue2))) : null;
                        if (mapG != null) {
                            builder.setParameters(mapG);
                        }
                        nativeAdLoader.loadAd(builder.build());
                    }
                    ((hi.g) result).success(null);
                    return;
                }
            } else if (str.equals("initialize")) {
                Boolean bool = (Boolean) call.a("isDebug");
                this.f16369j = bool != null ? bool.booleanValue() : false;
                if (this.f16368h) {
                    ((hi.g) result).success(null);
                    return;
                }
                this.f16370k.add(result);
                if (this.i) {
                    return;
                }
                this.i = true;
                MobileAds.enableDebugErrorIndicator(this.f16369j);
                MobileAds.enableLogging(this.f16369j);
                Context context2 = this.f16364d;
                if (context2 != null) {
                    MobileAds.initialize(context2, new a0(18, this));
                    return;
                } else {
                    Intrinsics.g("appContext");
                    throw null;
                }
            }
        } else if (str.equals("native.dispose")) {
            String str3 = (String) call.a("id");
            if (str3 != null && (eVar = (e) linkedHashMap.remove(str3)) != null) {
                NativeAdLoader nativeAdLoader2 = eVar.f16375c;
                if (nativeAdLoader2 != null) {
                    nativeAdLoader2.cancelLoading();
                }
                eVar.f16376d = false;
                eVar.f16377e = null;
                eVar.f16375c = null;
            }
            ((hi.g) result).success(null);
            return;
        }
        ((hi.g) result).a();
    }
}
