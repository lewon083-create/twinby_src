package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xv implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f12341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t9.e0 f12342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12343d = "-1";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12344e = -1;

    public xv(Context context, t9.e0 e0Var) {
        this.f12341b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f12342c = e0Var;
        this.f12340a = context;
    }

    public final void a(int i, String str) {
        Context context;
        wk wkVar = al.W0;
        q9.s sVar = q9.s.f31967e;
        boolean z5 = true;
        if (!((Boolean) sVar.f31970c.a(wkVar)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z5 = false;
        }
        this.f12342c.s(z5);
        if (((Boolean) sVar.f31970c.a(al.W6)).booleanValue() && z5 && (context = this.f12340a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            wk wkVar = al.Y0;
            q9.s sVar = q9.s.f31967e;
            if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                boolean zEquals = Objects.equals(str, "gad_has_consent_for_cookies");
                Context context = this.f12340a;
                t9.e0 e0Var = this.f12342c;
                if (zEquals) {
                    int i = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    e0Var.i();
                    if (i != e0Var.f33575m) {
                        e0Var.s(true);
                        com.google.android.gms.internal.auth.m.D(context);
                    }
                    e0Var.b(i);
                    return;
                }
                if (Objects.equals(str, "IABTCF_TCString")) {
                    String string = sharedPreferences.getString(str, "-1");
                    e0Var.i();
                    if (!Objects.equals(string, e0Var.f33574l)) {
                        e0Var.s(true);
                        com.google.android.gms.internal.auth.m.D(context);
                    }
                    e0Var.a(string);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i10 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String strValueOf = String.valueOf(str);
            int iHashCode = strValueOf.hashCode();
            if (iHashCode == -2004976699) {
                if (!strValueOf.equals("IABTCF_PurposeConsents") || string2.equals("-1") || this.f12343d.equals(string2)) {
                    return;
                }
                this.f12343d = string2;
                a(i10, string2);
                return;
            }
            if (iHashCode == -527267622 && strValueOf.equals("gad_has_consent_for_cookies")) {
                if (!((Boolean) sVar.f31970c.a(al.W0)).booleanValue() || i10 == -1 || this.f12344e == i10) {
                    return;
                }
                this.f12344e = i10;
                a(i10, string2);
            }
        } catch (Throwable th2) {
            p9.k.C.f31302h.d("AdMobPlusIdlessListener.onSharedPreferenceChanged", th2);
            t9.c0.n("onSharedPreferenceChanged, errorMessage = ", th2);
        }
    }
}
