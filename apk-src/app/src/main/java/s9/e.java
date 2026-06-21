package s9;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import pa.l0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends qa.a {
    public static final Parcelable.Creator<e> CREATOR = new l0(7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f32831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f32832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f32833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f32834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f32835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f32836h;
    public final Intent i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f32837j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f32838k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Bundle f32839l;

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z5, Bundle bundle) {
        this.f32830b = str;
        this.f32831c = str2;
        this.f32832d = str3;
        this.f32833e = str4;
        this.f32834f = str5;
        this.f32835g = str6;
        this.f32836h = str7;
        this.i = intent;
        this.f32837j = (a) xa.b.X1(xa.b.L1(iBinder));
        this.f32838k = z5;
        this.f32839l = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 2, this.f32830b);
        j0.g.b0(parcel, 3, this.f32831c);
        j0.g.b0(parcel, 4, this.f32832d);
        j0.g.b0(parcel, 5, this.f32833e);
        j0.g.b0(parcel, 6, this.f32834f);
        j0.g.b0(parcel, 7, this.f32835g);
        j0.g.b0(parcel, 8, this.f32836h);
        j0.g.a0(parcel, 9, this.i, i);
        j0.g.X(parcel, 10, new xa.b(this.f32837j));
        j0.g.h0(parcel, 11, 4);
        parcel.writeInt(this.f32838k ? 1 : 0);
        j0.g.V(parcel, 12, this.f32839l);
        j0.g.m0(parcel, iI0);
    }

    public e(Intent intent, a aVar) {
        this(null, null, null, null, null, null, null, intent, new xa.b(aVar), false, new Bundle());
    }

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, a aVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, new xa.b(aVar), false, new Bundle());
    }
}
