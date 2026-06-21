package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ag extends w21 {
    public static final Parcelable.Creator<ag> CREATOR = new zf();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f36704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f36705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f36706f;

    public ag(Parcel parcel) {
        super("APIC");
        this.f36703c = (String) lb3.a((Object) parcel.readString());
        this.f36704d = parcel.readString();
        this.f36705e = parcel.readInt();
        this.f36706f = (byte[]) lb3.a((Object) parcel.createByteArray());
    }

    @Override // yads.us1
    public final void a(km1 km1Var) {
        byte[] bArr = this.f36706f;
        int i = this.f36705e;
        if (km1Var.f40260j == null || lb3.a((Object) Integer.valueOf(i), (Object) 3) || !lb3.a((Object) km1Var.f40261k, (Object) 3)) {
            km1Var.f40260j = (byte[]) bArr.clone();
            km1Var.f40261k = Integer.valueOf(i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ag.class == obj.getClass()) {
            ag agVar = (ag) obj;
            if (this.f36705e == agVar.f36705e && lb3.a(this.f36703c, agVar.f36703c) && lb3.a(this.f36704d, agVar.f36704d) && Arrays.equals(this.f36706f, agVar.f36706f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f36705e + 527) * 31;
        String str = this.f36703c;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f36704d;
        return Arrays.hashCode(this.f36706f) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // yads.w21
    public final String toString() {
        return this.f44259b + ": mimeType=" + this.f36703c + ", description=" + this.f36704d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36703c);
        parcel.writeString(this.f36704d);
        parcel.writeInt(this.f36705e);
        parcel.writeByteArray(this.f36706f);
    }

    public ag(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f36703c = str;
        this.f36704d = str2;
        this.f36705e = i;
        this.f36706f = bArr;
    }
}
