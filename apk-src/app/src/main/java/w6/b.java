package w6;

import a0.u;
import android.os.Parcel;
import android.util.SparseIntArray;
import h1.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f35165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f35166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f35167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f35168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f35169h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35170j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35171k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new e(0), new e(0), new e(0));
    }

    @Override // w6.a
    public final b a() {
        Parcel parcel = this.f35166e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f35170j;
        if (i == this.f35167f) {
            i = this.f35168g;
        }
        return new b(parcel, iDataPosition, i, u.o(new StringBuilder(), this.f35169h, "  "), this.f35162a, this.f35163b, this.f35164c);
    }

    @Override // w6.a
    public final boolean e(int i) {
        while (this.f35170j < this.f35168g) {
            int i10 = this.f35171k;
            if (i10 == i) {
                return true;
            }
            if (String.valueOf(i10).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i11 = this.f35170j;
            Parcel parcel = this.f35166e;
            parcel.setDataPosition(i11);
            int i12 = parcel.readInt();
            this.f35171k = parcel.readInt();
            this.f35170j += i12;
        }
        return this.f35171k == i;
    }

    @Override // w6.a
    public final void h(int i) {
        int i10 = this.i;
        SparseIntArray sparseIntArray = this.f35165d;
        Parcel parcel = this.f35166e;
        if (i10 >= 0) {
            int i11 = sparseIntArray.get(i10);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(iDataPosition - i11);
            parcel.setDataPosition(iDataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public b(Parcel parcel, int i, int i10, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f35165d = new SparseIntArray();
        this.i = -1;
        this.f35171k = -1;
        this.f35166e = parcel;
        this.f35167f = i;
        this.f35168g = i10;
        this.f35170j = i;
        this.f35169h = str;
    }
}
