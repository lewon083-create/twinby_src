package yads;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f43859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f43860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f43861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f43862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f43863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f43864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f43865h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f43866j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f43867k;

    public v23(long j10, boolean z5, boolean z10, boolean z11, ArrayList arrayList, long j11, boolean z12, long j12, int i, int i10, int i11) {
        this.f43858a = j10;
        this.f43859b = z5;
        this.f43860c = z10;
        this.f43861d = z11;
        this.f43863f = Collections.unmodifiableList(arrayList);
        this.f43862e = j11;
        this.f43864g = z12;
        this.f43865h = j12;
        this.i = i;
        this.f43866j = i10;
        this.f43867k = i11;
    }

    public static v23 a(Parcel parcel) {
        return new v23(parcel);
    }

    public v23(Parcel parcel) {
        this.f43858a = parcel.readLong();
        this.f43859b = parcel.readByte() == 1;
        this.f43860c = parcel.readByte() == 1;
        this.f43861d = parcel.readByte() == 1;
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i10 = 0; i10 < i; i10++) {
            arrayList.add(u23.a(parcel));
        }
        this.f43863f = Collections.unmodifiableList(arrayList);
        this.f43862e = parcel.readLong();
        this.f43864g = parcel.readByte() == 1;
        this.f43865h = parcel.readLong();
        this.i = parcel.readInt();
        this.f43866j = parcel.readInt();
        this.f43867k = parcel.readInt();
    }
}
