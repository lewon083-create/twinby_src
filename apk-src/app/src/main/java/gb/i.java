package gb;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends qa.a {
    public static final Parcelable.Creator<i> CREATOR = new com.google.android.material.datepicker.a(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f20079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f20080g;

    static {
        Process.myUid();
        Process.myPid();
    }

    public i(int i, String packageName, String str, String str2, ArrayList arrayList, i iVar) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (iVar != null && iVar.f20080g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f20075b = i;
        this.f20076c = packageName;
        this.f20077d = str;
        this.f20078e = str2 == null ? iVar != null ? iVar.f20078e : null : str2;
        Collection collection = arrayList;
        if (arrayList == null) {
            q qVar = iVar != null ? iVar.f20079f : null;
            collection = qVar;
            if (qVar == null) {
                o oVar = q.f20103c;
                r rVar = r.f20104f;
                Intrinsics.checkNotNullExpressionValue(rVar, "of(...)");
                collection = rVar;
            }
        }
        Intrinsics.checkNotNullParameter(collection, "<this>");
        o oVar2 = q.f20103c;
        Object[] array = collection.toArray();
        int length = array.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (array[i10] == null) {
                throw new NullPointerException(l7.o.j(i10, "at index ", new StringBuilder(String.valueOf(i10).length() + 9)));
            }
        }
        r rVar2 = length == 0 ? r.f20104f : new r(length, array);
        Intrinsics.checkNotNullExpressionValue(rVar2, "copyOf(...)");
        this.f20079f = rVar2;
        this.f20080g = iVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f20075b == iVar.f20075b && Intrinsics.a(this.f20076c, iVar.f20076c) && Intrinsics.a(this.f20077d, iVar.f20077d) && Intrinsics.a(this.f20078e, iVar.f20078e) && Intrinsics.a(this.f20080g, iVar.f20080g) && Intrinsics.a(this.f20079f, iVar.f20079f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f20075b), this.f20076c, this.f20077d, this.f20078e, this.f20080g});
    }

    public final String toString() {
        String str = this.f20076c;
        int length = str.length() + 18;
        String str2 = this.f20077d;
        StringBuilder sb2 = new StringBuilder(length + (str2 != null ? str2.length() : 0));
        sb2.append(this.f20075b);
        sb2.append("/");
        sb2.append(str);
        if (str2 != null) {
            sb2.append("[");
            if (a0.n(str2, str, false)) {
                sb2.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb2.append(str2);
            }
            sb2.append("]");
        }
        String str3 = this.f20078e;
        if (str3 != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int iI0 = j0.g.i0(dest, 20293);
        j0.g.h0(dest, 1, 4);
        dest.writeInt(this.f20075b);
        j0.g.b0(dest, 3, this.f20076c);
        j0.g.b0(dest, 4, this.f20077d);
        j0.g.b0(dest, 6, this.f20078e);
        j0.g.a0(dest, 7, this.f20080g, i);
        j0.g.f0(dest, 8, this.f20079f);
        j0.g.m0(dest, iI0);
    }
}
