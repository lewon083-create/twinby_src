package xe;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.common.api.Status;
import com.vk.api.sdk.exceptions.VKApiCodes;
import hi.g;
import ii.o;
import ii.q;
import ii.s;
import io.sentry.protocol.FeatureFlag;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.jvm.internal.Intrinsics;
import m.h3;
import pa.c0;
import tb.c;
import tb.j;
import tb.n;
import xh.l;
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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class b implements ei.b, o, fi.a, s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f36087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f36088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fi.b f36089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f36090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f36091f;

    @Override // ii.s
    public final boolean a(int i, int i10, Intent intent) {
        j jVarCreateFromParcel;
        if (i != 991) {
            return false;
        }
        if (i10 != -1) {
            if (i10 == 0) {
                g gVar = this.f36091f;
                if (gVar != null) {
                    gVar.success(i0.c(new Pair("status", "CANCELED")));
                }
                this.f36091f = null;
                return true;
            }
            if (i10 != 1) {
                return true;
            }
            if (intent == null) {
                g gVar2 = this.f36091f;
                if (gVar2 != null) {
                    gVar2.b("RequestPayment", "Intent is null", null);
                }
            } else {
                int i11 = c.f33675c;
                Status status = (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
                if (status == null) {
                    g gVar3 = this.f36091f;
                    if (gVar3 != null) {
                        gVar3.b("RequestPayment", "Status is null", null);
                    }
                } else {
                    g gVar4 = this.f36091f;
                    if (gVar4 != null) {
                        gVar4.success(j0.g(new Pair("status", "ERROR"), new Pair(VKApiCodes.PARAM_ERROR_CODE, Integer.valueOf(status.f2633b)), new Pair("error_message", status.f2634c), new Pair("error_description", status.toString())));
                    }
                }
            }
            this.f36091f = null;
            return true;
        }
        if (intent == null) {
            g gVar5 = this.f36091f;
            if (gVar5 != null) {
                gVar5.b("RequestPayment", "Intent is null", null);
            }
        } else {
            Parcelable.Creator<j> creator = j.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
            if (byteArrayExtra == null) {
                jVarCreateFromParcel = null;
            } else {
                c0.i(creator);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
                parcelObtain.setDataPosition(0);
                jVarCreateFromParcel = creator.createFromParcel(parcelObtain);
                parcelObtain.recycle();
            }
            j jVar = jVarCreateFromParcel;
            if (jVar == null) {
                g gVar6 = this.f36091f;
                if (gVar6 != null) {
                    gVar6.b("RequestPayment", "Payment data is null", null);
                }
            } else {
                String str = jVar.f33724h;
                Intrinsics.checkNotNullExpressionValue(str, "toJson(...)");
                g gVar7 = this.f36091f;
                if (gVar7 != null) {
                    gVar7.success(j0.g(new Pair("status", "SUCCESS"), new Pair(FeatureFlag.JsonKeys.RESULT, str)));
                }
            }
        }
        this.f36091f = null;
        return true;
    }

    @Override // fi.a
    public final void onAttachedToActivity(fi.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        h3 h3Var = (h3) binding;
        w wVar = (w) h3Var.f28250b;
        this.f36088c = wVar instanceof l ? (l) wVar : null;
        this.f36089d = binding;
        h3Var.a(this);
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        q qVar = new q(flutterPluginBinding.f16383c, "cloudpayments");
        this.f36087b = qVar;
        qVar.b(this);
    }

    @Override // fi.a
    public final void onDetachedFromActivity() {
        this.f36088c = null;
        this.f36090e = null;
        fi.b bVar = this.f36089d;
        if (bVar != null) {
            ((h3) bVar).g(this);
        }
        this.f36089d = null;
    }

    @Override // fi.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f36088c = null;
        fi.b bVar = this.f36089d;
        if (bVar != null) {
            ((h3) bVar).g(this);
        }
        this.f36089d = null;
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        q qVar = this.f36087b;
        if (qVar != null) {
            qVar.b(null);
        } else {
            Intrinsics.g(AppsFlyerProperties.CHANNEL);
            throw null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0114  */
    @Override // ii.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMethodCall(ii.n r21, ii.p r22) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1084
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xe.b.onMethodCall(ii.n, ii.p):void");
    }

    @Override // fi.a
    public final void onReattachedToActivityForConfigChanges(fi.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        h3 h3Var = (h3) binding;
        w wVar = (w) h3Var.f28250b;
        this.f36088c = wVar instanceof l ? (l) wVar : null;
        this.f36089d = binding;
        h3Var.a(this);
    }
}
