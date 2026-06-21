package d8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.play_billing.o1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends cb.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15578c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0 f15579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f15581f;

    public a0(s3.q qVar, a1.e eVar, int i) {
        super("com.android.vending.billing.IInAppBillingCreateAlternativeBillingOnlyTokenCallback", 2);
        this.f15581f = qVar;
        this.f15579d = eVar;
        this.f15580e = i;
    }

    @Override // cb.c
    public final boolean w1(int i, Parcel parcel, Parcel parcel2) {
        switch (this.f15578c) {
            case 0:
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle) com.google.android.gms.internal.play_billing.e.a(parcel);
                com.google.android.gms.internal.play_billing.e.b(parcel);
                s3.q qVar = (s3.q) this.f15581f;
                int i10 = this.f15580e;
                m0 m0Var = this.f15579d;
                if (bundle == null) {
                    j jVar = n0.i;
                    ((a1.e) m0Var).X(l0.b(71, 15, jVar), i10);
                    qVar.f(jVar);
                    return true;
                }
                int iA = o1.a(bundle, "BillingClient");
                j jVarA = n0.a(iA, o1.e(bundle, "BillingClient"));
                if (iA != 0) {
                    o1.g("BillingClient", "createAlternativeBillingOnlyReportingDetailsAsync() failed. Response code: " + iA);
                    ((a1.e) m0Var).X(l0.b(23, 15, jVarA), i10);
                    qVar.f(jVarA);
                    return true;
                }
                try {
                    String strOptString = new JSONObject(bundle.getString("CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS")).optString("externalTransactionToken");
                    jh.b bVar = (jh.b) qVar.f32631c;
                    yi.l lVarH = ya.e.h(jVarA);
                    yi.f fVar = new yi.f();
                    fVar.f45654a = lVarH;
                    if (strOptString == null) {
                        throw new IllegalStateException("Nonnull field \"externalTransactionToken\" is null.");
                    }
                    fVar.f45655b = strOptString;
                    bVar.e(fVar);
                    return true;
                } catch (JSONException e3) {
                    o1.h("BillingClient", "Error when parsing invalid alternative billing only reporting details. \n Exception: ", e3);
                    j jVar2 = n0.i;
                    ((a1.e) m0Var).X(l0.b(72, 15, jVar2), i10);
                    qVar.f(jVar2);
                    return true;
                }
            case 1:
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) com.google.android.gms.internal.play_billing.e.a(parcel);
                com.google.android.gms.internal.play_billing.e.b(parcel);
                yi.f0 f0Var = (yi.f0) this.f15581f;
                int i11 = this.f15580e;
                m0 m0Var2 = this.f15579d;
                if (bundle2 == null) {
                    j jVar3 = n0.i;
                    ((a1.e) m0Var2).X(l0.b(63, 13, jVar3), i11);
                    f0Var.c(jVar3);
                } else {
                    int iA2 = o1.a(bundle2, "BillingClient");
                    String strE = o1.e(bundle2, "BillingClient");
                    i iVarA = j.a();
                    iVarA.f15634b = iA2;
                    iVarA.f15635c = strE;
                    if (iA2 != 0) {
                        o1.g("BillingClient", "getBillingConfig() failed. Response code: " + iA2);
                        j jVarA2 = iVarA.a();
                        ((a1.e) m0Var2).X(l0.b(23, 13, jVarA2), i11);
                        f0Var.c(jVarA2);
                    } else if (bundle2.containsKey("BILLING_CONFIG")) {
                        try {
                            String strOptString2 = new JSONObject(bundle2.getString("BILLING_CONFIG")).optString("countryCode");
                            j jVarA3 = iVarA.a();
                            jh.b bVar2 = (jh.b) f0Var.f45657c;
                            yi.l lVarH2 = ya.e.h(jVarA3);
                            yi.i iVar = new yi.i();
                            iVar.f45668a = lVarH2;
                            if (strOptString2 == null) {
                                throw new IllegalStateException("Nonnull field \"countryCode\" is null.");
                            }
                            iVar.f45669b = strOptString2;
                            bVar2.e(iVar);
                        } catch (JSONException e7) {
                            o1.h("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e7);
                            j jVar4 = n0.i;
                            ((a1.e) m0Var2).X(l0.b(65, 13, jVar4), i11);
                            f0Var.c(jVar4);
                        }
                    } else {
                        o1.g("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
                        iVarA.f15634b = 6;
                        j jVarA4 = iVarA.a();
                        ((a1.e) m0Var2).X(l0.b(64, 13, jVarA4), i11);
                        f0Var.c(jVarA4);
                    }
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) com.google.android.gms.internal.play_billing.e.a(parcel);
                com.google.android.gms.internal.play_billing.e.b(parcel);
                yi.f0 f0Var2 = (yi.f0) this.f15581f;
                int i12 = this.f15580e;
                m0 m0Var3 = this.f15579d;
                if (bundle3 == null) {
                    j jVar5 = n0.i;
                    ((a1.e) m0Var3).X(l0.b(67, 14, jVar5), i12);
                    ((jh.b) f0Var2.f45657c).e(ya.e.h(jVar5));
                    return true;
                }
                int iA3 = o1.a(bundle3, "BillingClient");
                j jVarA5 = n0.a(iA3, o1.e(bundle3, "BillingClient"));
                if (iA3 != 0) {
                    o1.g("BillingClient", "isAlternativeBillingOnlyAvailableAsync() failed. Response code: " + iA3);
                    ((a1.e) m0Var3).X(l0.b(23, 14, jVarA5), i12);
                }
                ((jh.b) f0Var2.f45657c).e(ya.e.h(jVarA5));
                return true;
        }
    }

    public a0(yi.f0 f0Var, a1.e eVar, int i) {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback", 2);
        this.f15581f = f0Var;
        this.f15579d = eVar;
        this.f15580e = i;
    }

    public a0(yi.f0 f0Var, a1.e eVar, int i, byte b2) {
        super("com.android.vending.billing.IInAppBillingIsAlternativeBillingOnlyAvailableCallback", 2);
        this.f15581f = f0Var;
        this.f15579d = eVar;
        this.f15580e = i;
    }
}
