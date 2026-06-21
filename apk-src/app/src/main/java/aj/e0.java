package aj;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.ads.om1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class e0 implements ei.b, g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ka.k f953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nc.e f954d = new nc.e();

    public static final Object a(e0 e0Var, String str, String str2, oj.i iVar) {
        t2.e eVarA = ya.e.A(str);
        Context context = e0Var.f952b;
        mj.a aVar = null;
        if (context != null) {
            Object objE = a.a.e(f0.a(context), new k(eVarA, str2, aVar, 0), iVar);
            return objE == nj.a.f29512b ? objE : Unit.f27471a;
        }
        Intrinsics.g("context");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        if (r12 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c2, code lost:
    
        if (r12 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c4, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c2 -> B:35:0x00c5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(aj.e0 r10, java.util.List r11, oj.c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: aj.e0.f(aj.e0, java.util.List, oj.c):java.lang.Object");
    }

    @Override // aj.g
    public final Boolean b(String key, h options) throws Throwable {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        hk.c0.p(new o(key, this, f0Var, null, 0));
        return (Boolean) f0Var.f27510b;
    }

    @Override // aj.g
    public final String c(String key, h options) throws Throwable {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        hk.c0.p(new o(key, this, f0Var, null, 3));
        return (String) f0Var.f27510b;
    }

    @Override // aj.g
    public final void d(String key, String value, h options) throws Throwable {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(options, "options");
        hk.c0.p(new z(this, key, value, null, 1));
    }

    @Override // aj.g
    public final void e(String key, double d10, h options) throws Throwable {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        hk.c0.p(new b0(key, this, d10, null));
    }

    @Override // aj.g
    public final void g(String key, String value, h options) throws Throwable {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(options, "options");
        hk.c0.p(new z(this, key, value, null, 2));
    }

    @Override // aj.g
    public final i0 l(String key, h options) throws Throwable {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        String strC = c(key, options);
        if (strC != null) {
            return kotlin.text.a0.n(strC, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false) ? new i0(strC, g0.f962e) : kotlin.text.a0.n(strC, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) ? new i0(null, g0.f961d) : new i0(null, g0.f963f);
        }
        return null;
    }

    @Override // aj.g
    public final Map o(List list, h options) {
        Intrinsics.checkNotNullParameter(options, "options");
        return (Map) hk.c0.p(new j(this, list, null, 1));
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        ii.f fVar = binding.f16383c;
        Intrinsics.checkNotNullExpressionValue(fVar, "getBinaryMessenger(...)");
        Context context = binding.f16381a;
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        this.f952b = context;
        try {
            g.f959s1.getClass();
            f.b(fVar, this, "data_store");
            this.f953c = new ka.k(fVar, context, this.f954d);
        } catch (Exception e3) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e3);
        }
        new a().onAttachedToEngine(binding);
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        ii.f fVar = binding.f16383c;
        Intrinsics.checkNotNullExpressionValue(fVar, "getBinaryMessenger(...)");
        g.f959s1.getClass();
        f.b(fVar, null, "data_store");
        ka.k kVar = this.f953c;
        if (kVar != null) {
            f.b((ii.f) kVar.f27324c, null, "shared_preferences");
        }
        this.f953c = null;
    }

    @Override // aj.g
    public final void p(String key, List value, h options) throws Throwable {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(options, "options");
        hk.c0.p(new z(this, key, om1.k("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", this.f954d.g(value)), null, 0));
    }

    @Override // aj.g
    public final ArrayList q(String key, h options) throws Throwable {
        List list;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        String strC = c(key, options);
        if (strC == null || kotlin.text.a0.n(strC, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false) || !kotlin.text.a0.n(strC, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) || (list = (List) f0.c(strC, this.f954d)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // aj.g
    public final void s(String key, boolean z5, h options) throws Throwable {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        hk.c0.p(new y(key, this, z5, null));
    }

    @Override // aj.g
    public final Long t(String key, h options) throws Throwable {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        hk.c0.p(new o(key, this, f0Var, null, 2));
        return (Long) f0Var.f27510b;
    }

    @Override // aj.g
    public final List v(List list, h options) {
        Intrinsics.checkNotNullParameter(options, "options");
        return CollectionsKt.R(((Map) hk.c0.p(new j(this, list, null, 2))).keySet());
    }

    @Override // aj.g
    public final Double x(String key, h options) throws Throwable {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        hk.c0.p(new o(key, this, f0Var, null, 1));
        return (Double) f0Var.f27510b;
    }

    @Override // aj.g
    public final void y(String key, long j10, h options) throws Throwable {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        hk.c0.p(new d0(key, this, j10, null));
    }

    @Override // aj.g
    public final void z(List list, h options) throws Throwable {
        Intrinsics.checkNotNullParameter(options, "options");
        hk.c0.p(new j(this, list, null, 0));
    }
}
