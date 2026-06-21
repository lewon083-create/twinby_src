package tb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import pa.l0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends qa.a {
    public static final Parcelable.Creator<h> CREATOR = new l0(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f33695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f33696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f33698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f33699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f33700h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f33701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f33702k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f33703l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f33704m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ub.f f33705n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f33706o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f33707p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f33708q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f33709r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f33710s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f33711t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f33712u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f33713v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ub.c f33714w;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 2, this.f33694b);
        j0.g.b0(parcel, 3, this.f33695c);
        j0.g.b0(parcel, 4, this.f33696d);
        j0.g.b0(parcel, 5, this.f33697e);
        j0.g.b0(parcel, 6, this.f33698f);
        j0.g.b0(parcel, 7, this.f33699g);
        j0.g.b0(parcel, 8, this.f33700h);
        j0.g.b0(parcel, 9, this.i);
        j0.g.b0(parcel, 10, this.f33701j);
        j0.g.b0(parcel, 11, this.f33702k);
        int i10 = this.f33703l;
        j0.g.h0(parcel, 12, 4);
        parcel.writeInt(i10);
        j0.g.f0(parcel, 13, this.f33704m);
        j0.g.a0(parcel, 14, this.f33705n, i);
        j0.g.f0(parcel, 15, this.f33706o);
        j0.g.b0(parcel, 16, this.f33707p);
        j0.g.b0(parcel, 17, this.f33708q);
        j0.g.f0(parcel, 18, this.f33709r);
        boolean z5 = this.f33710s;
        j0.g.h0(parcel, 19, 4);
        parcel.writeInt(z5 ? 1 : 0);
        j0.g.f0(parcel, 20, this.f33711t);
        j0.g.f0(parcel, 21, this.f33712u);
        j0.g.f0(parcel, 22, this.f33713v);
        j0.g.a0(parcel, 23, this.f33714w, i);
        j0.g.m0(parcel, iI0);
    }
}
