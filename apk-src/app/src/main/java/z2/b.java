package z2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new ub.i(9);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f45803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f45804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f45805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f45806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f45807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f45808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f45809h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CharSequence f45810j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f45811k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CharSequence f45812l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f45813m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f45814n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f45815o;

    public b(a aVar) {
        int size = aVar.f45785a.size();
        this.f45803b = new int[size * 6];
        if (!aVar.f45791g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f45804c = new ArrayList(size);
        this.f45805d = new int[size];
        this.f45806e = new int[size];
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            n0 n0Var = (n0) aVar.f45785a.get(i10);
            int i11 = i + 1;
            this.f45803b[i] = n0Var.f45909a;
            ArrayList arrayList = this.f45804c;
            t tVar = n0Var.f45910b;
            arrayList.add(tVar != null ? tVar.f45972f : null);
            int[] iArr = this.f45803b;
            iArr[i11] = n0Var.f45911c ? 1 : 0;
            iArr[i + 2] = n0Var.f45912d;
            iArr[i + 3] = n0Var.f45913e;
            int i12 = i + 5;
            iArr[i + 4] = n0Var.f45914f;
            i += 6;
            iArr[i12] = n0Var.f45915g;
            this.f45805d[i10] = n0Var.f45916h.ordinal();
            this.f45806e[i10] = n0Var.i.ordinal();
        }
        this.f45807f = aVar.f45790f;
        this.f45808g = aVar.f45792h;
        this.f45809h = aVar.f45801r;
        this.i = aVar.i;
        this.f45810j = aVar.f45793j;
        this.f45811k = aVar.f45794k;
        this.f45812l = aVar.f45795l;
        this.f45813m = aVar.f45796m;
        this.f45814n = aVar.f45797n;
        this.f45815o = aVar.f45798o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f45803b);
        parcel.writeStringList(this.f45804c);
        parcel.writeIntArray(this.f45805d);
        parcel.writeIntArray(this.f45806e);
        parcel.writeInt(this.f45807f);
        parcel.writeString(this.f45808g);
        parcel.writeInt(this.f45809h);
        parcel.writeInt(this.i);
        TextUtils.writeToParcel(this.f45810j, parcel, 0);
        parcel.writeInt(this.f45811k);
        TextUtils.writeToParcel(this.f45812l, parcel, 0);
        parcel.writeStringList(this.f45813m);
        parcel.writeStringList(this.f45814n);
        parcel.writeInt(this.f45815o ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f45803b = parcel.createIntArray();
        this.f45804c = parcel.createStringArrayList();
        this.f45805d = parcel.createIntArray();
        this.f45806e = parcel.createIntArray();
        this.f45807f = parcel.readInt();
        this.f45808g = parcel.readString();
        this.f45809h = parcel.readInt();
        this.i = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f45810j = (CharSequence) creator.createFromParcel(parcel);
        this.f45811k = parcel.readInt();
        this.f45812l = (CharSequence) creator.createFromParcel(parcel);
        this.f45813m = parcel.createStringArrayList();
        this.f45814n = parcel.createStringArrayList();
        this.f45815o = parcel.readInt() != 0;
    }
}
