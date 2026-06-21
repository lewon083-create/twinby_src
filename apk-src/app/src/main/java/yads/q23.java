package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q23 extends m23 {
    public static final Parcelable.Creator<q23> CREATOR = new o23();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f42147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f42148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f42149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f42150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f42151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f42152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f42153h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f42154j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f42155k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f42156l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f42157m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f42158n;

    public q23(long j10, boolean z5, boolean z10, boolean z11, boolean z12, long j11, long j12, List list, boolean z13, long j13, int i, int i10, int i11) {
        this.f42147b = j10;
        this.f42148c = z5;
        this.f42149d = z10;
        this.f42150e = z11;
        this.f42151f = z12;
        this.f42152g = j11;
        this.f42153h = j12;
        this.i = Collections.unmodifiableList(list);
        this.f42154j = z13;
        this.f42155k = j13;
        this.f42156l = i;
        this.f42157m = i10;
        this.f42158n = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f42147b);
        parcel.writeByte(this.f42148c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f42149d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f42150e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f42151f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f42152g);
        parcel.writeLong(this.f42153h);
        int size = this.i.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            p23 p23Var = (p23) this.i.get(i10);
            parcel.writeInt(p23Var.f41808a);
            parcel.writeLong(p23Var.f41809b);
            parcel.writeLong(p23Var.f41810c);
        }
        parcel.writeByte(this.f42154j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f42155k);
        parcel.writeInt(this.f42156l);
        parcel.writeInt(this.f42157m);
        parcel.writeInt(this.f42158n);
    }

    public q23(Parcel parcel) {
        this.f42147b = parcel.readLong();
        this.f42148c = parcel.readByte() == 1;
        this.f42149d = parcel.readByte() == 1;
        this.f42150e = parcel.readByte() == 1;
        this.f42151f = parcel.readByte() == 1;
        this.f42152g = parcel.readLong();
        this.f42153h = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i10 = 0; i10 < i; i10++) {
            arrayList.add(p23.a(parcel));
        }
        this.i = Collections.unmodifiableList(arrayList);
        this.f42154j = parcel.readByte() == 1;
        this.f42155k = parcel.readLong();
        this.f42156l = parcel.readInt();
        this.f42157m = parcel.readInt();
        this.f42158n = parcel.readInt();
    }
}
