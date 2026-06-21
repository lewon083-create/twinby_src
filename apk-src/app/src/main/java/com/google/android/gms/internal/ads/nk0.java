package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class nk0 extends ug implements qs {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f8324f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jx f8325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f8326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8328e;

    public nk0(String str, os osVar, jx jxVar, long j10) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
        JSONObject jSONObject = new JSONObject();
        this.f8326c = jSONObject;
        this.f8328e = false;
        this.f8325b = jxVar;
        this.f8327d = j10;
        try {
            jSONObject.put("adapter_version", osVar.c().toString());
            jSONObject.put("sdk_version", osVar.k().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String string = parcel.readString();
            vg.f(parcel);
            synchronized (this) {
                if (!this.f8328e) {
                    if (string == null) {
                        synchronized (this) {
                            l4(2, "Adapter returned null signals");
                        }
                    } else {
                        try {
                            JSONObject jSONObject = this.f8326c;
                            jSONObject.put("signals", string);
                            wk wkVar = al.Y1;
                            q9.s sVar = q9.s.f31967e;
                            if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                                p9.k.C.f31304k.getClass();
                                jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f8327d);
                            }
                            if (((Boolean) sVar.f31970c.a(al.X1)).booleanValue()) {
                                jSONObject.put("signal_error_code", 0);
                            }
                        } catch (JSONException unused) {
                        }
                        this.f8325b.b(this.f8326c);
                        this.f8328e = true;
                    }
                }
            }
        } else if (i == 2) {
            String string2 = parcel.readString();
            vg.f(parcel);
            synchronized (this) {
                l4(2, string2);
            }
        } else {
            if (i != 3) {
                return false;
            }
            q9.x1 x1Var = (q9.x1) vg.b(parcel, q9.x1.CREATOR);
            vg.f(parcel);
            synchronized (this) {
                l4(2, x1Var.f31977c);
            }
        }
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void l4(int i, String str) {
        try {
            if (this.f8328e) {
                return;
            }
            try {
                JSONObject jSONObject = this.f8326c;
                jSONObject.put("signal_error", str);
                wk wkVar = al.Y1;
                q9.s sVar = q9.s.f31967e;
                if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                    p9.k.C.f31304k.getClass();
                    jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f8327d);
                }
                if (((Boolean) sVar.f31970c.a(al.X1)).booleanValue()) {
                    jSONObject.put("signal_error_code", i);
                }
            } catch (JSONException unused) {
            }
            this.f8325b.b(this.f8326c);
            this.f8328e = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
