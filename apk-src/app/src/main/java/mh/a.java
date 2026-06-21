package mh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import e8.e;
import ei.b;
import hi.g;
import ii.n;
import ii.o;
import ii.p;
import ii.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m.h3;
import sb.m;
import z2.w;

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
public final class a implements b, o, fi.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f28897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f28898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Activity f28899d;

    public final boolean a(g gVar) {
        Log.i("InAppReviewPlugin", "noContextOrActivity: called");
        if (this.f28898c == null) {
            Log.e("InAppReviewPlugin", "noContextOrActivity: Android context not available");
            if (gVar != null) {
                gVar.b("error", "Android context not available", null);
                return true;
            }
        } else {
            if (this.f28899d != null) {
                return false;
            }
            Log.e("InAppReviewPlugin", "noContextOrActivity: Android activity not available");
            if (gVar != null) {
                gVar.b("error", "Android activity not available", null);
            }
        }
        return true;
    }

    @Override // fi.a
    public final void onAttachedToActivity(fi.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f28899d = (w) ((h3) binding).f28250b;
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        q qVar = new q(flutterPluginBinding.f16383c, "dev.britannio.in_app_review");
        this.f28897b = qVar;
        qVar.b(this);
        this.f28898c = flutterPluginBinding.f16381a;
    }

    @Override // fi.a
    public final void onDetachedFromActivity() {
        this.f28899d = null;
    }

    @Override // fi.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f28899d = null;
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        q qVar = this.f28897b;
        if (qVar == null) {
            Intrinsics.g(AppsFlyerProperties.CHANNEL);
            throw null;
        }
        qVar.b(null);
        this.f28898c = null;
    }

    @Override // ii.o
    public final void onMethodCall(n call, p result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        Log.i("InAppReviewPlugin", "onMethodCall: ".concat(call.f21315a));
        String str = call.f21315a;
        int iHashCode = str.hashCode();
        if (iHashCode != 159262157) {
            if (iHashCode != 444517567) {
                if (iHashCode == 1361080007 && str.equals("requestReview")) {
                    Log.i("InAppReviewPlugin", "requestReview: called");
                    g gVar = (g) result;
                    if (a(gVar)) {
                        return;
                    }
                    try {
                        Context context = this.f28898c;
                        Intrinsics.b(context);
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        r3.b bVar = new r3.b(new uc.g(context));
                        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
                        m mVarF = bVar.F();
                        Intrinsics.checkNotNullExpressionValue(mVarF, "requestReviewFlow(...)");
                        mVarF.addOnCompleteListener(new com.google.firebase.messaging.o(this, bVar, (g) result, 12));
                        return;
                    } catch (Exception e3) {
                        Log.e("InAppReviewPlugin", "requestReview: error", e3);
                        gVar.b("error", "An error occurred during the request review flow", null);
                        return;
                    }
                }
            } else if (str.equals("isAvailable")) {
                Log.i("InAppReviewPlugin", "isAvailable: called");
                if (a(null)) {
                    ((g) result).success(Boolean.FALSE);
                    return;
                }
                try {
                    Context context2 = this.f28898c;
                    Intrinsics.b(context2);
                    Context applicationContext2 = context2.getApplicationContext();
                    if (applicationContext2 != null) {
                        context2 = applicationContext2;
                    }
                    r3.b bVar2 = new r3.b(new uc.g(context2));
                    Intrinsics.checkNotNullExpressionValue(bVar2, "create(...)");
                    m mVarF2 = bVar2.F();
                    Intrinsics.checkNotNullExpressionValue(mVarF2, "requestReviewFlow(...)");
                    mVarF2.addOnCompleteListener(new e((g) result, 6));
                    return;
                } catch (Exception e7) {
                    Log.e("InAppReviewPlugin", "isAvailable: error", e7);
                    ((g) result).success(Boolean.FALSE);
                    return;
                }
            }
        } else if (str.equals("openStoreListing")) {
            Log.i("InAppReviewPlugin", "openStoreListing: called");
            g gVar2 = (g) result;
            if (a(gVar2)) {
                return;
            }
            try {
                Context context3 = this.f28898c;
                Intrinsics.b(context3);
                String packageName = context3.getPackageName();
                Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse("https://play.google.com/store/apps/details?id=" + packageName));
                Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
                Activity activity = this.f28899d;
                Intrinsics.b(activity);
                activity.startActivity(data);
                ((g) result).success(null);
                return;
            } catch (Exception e10) {
                Log.e("InAppReviewPlugin", "openStoreListing: error", e10);
                gVar2.b("error", "An error occurred while opening the play store", null);
                return;
            }
        }
        ((g) result).a();
    }

    @Override // fi.a
    public final void onReattachedToActivityForConfigChanges(fi.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f28899d = (w) ((h3) binding).f28250b;
    }
}
