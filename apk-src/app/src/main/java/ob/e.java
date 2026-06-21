package ob;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends qa.a {
    public static final Parcelable.Creator<e> CREATOR = new kb.i(13);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b4 f30075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f30076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f30077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f30078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f30079h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v f30080j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f30081k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v f30082l;

    public e(String str, String str2, b4 b4Var, long j10, boolean z5, String str3, v vVar, long j11, v vVar2, long j12, v vVar3) {
        this.f30073b = str;
        this.f30074c = str2;
        this.f30075d = b4Var;
        this.f30076e = j10;
        this.f30077f = z5;
        this.f30078g = str3;
        this.f30079h = vVar;
        this.i = j11;
        this.f30080j = vVar2;
        this.f30081k = j12;
        this.f30082l = vVar3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 2, this.f30073b);
        j0.g.b0(parcel, 3, this.f30074c);
        j0.g.a0(parcel, 4, this.f30075d, i);
        long j10 = this.f30076e;
        j0.g.h0(parcel, 5, 8);
        parcel.writeLong(j10);
        boolean z5 = this.f30077f;
        j0.g.h0(parcel, 6, 4);
        parcel.writeInt(z5 ? 1 : 0);
        j0.g.b0(parcel, 7, this.f30078g);
        j0.g.a0(parcel, 8, this.f30079h, i);
        long j11 = this.i;
        j0.g.h0(parcel, 9, 8);
        parcel.writeLong(j11);
        j0.g.a0(parcel, 10, this.f30080j, i);
        j0.g.h0(parcel, 11, 8);
        parcel.writeLong(this.f30081k);
        j0.g.a0(parcel, 12, this.f30082l, i);
        j0.g.m0(parcel, iI0);
    }

    public e(e eVar) {
        pa.c0.i(eVar);
        this.f30073b = eVar.f30073b;
        this.f30074c = eVar.f30074c;
        this.f30075d = eVar.f30075d;
        this.f30076e = eVar.f30076e;
        this.f30077f = eVar.f30077f;
        this.f30078g = eVar.f30078g;
        this.f30079h = eVar.f30079h;
        this.i = eVar.i;
        this.f30080j = eVar.f30080j;
        this.f30081k = eVar.f30081k;
        this.f30082l = eVar.f30082l;
    }
}
