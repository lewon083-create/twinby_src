package yads;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qj0 implements Parcelable {
    public static final Parcelable.Creator<qj0> CREATOR = new pj0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f42317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f42319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f42320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f42321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f42322h;

    public qj0(Parcel parcel) {
        this.f42316b = (String) lb3.a((Object) parcel.readString());
        this.f42317c = Uri.parse((String) lb3.a((Object) parcel.readString()));
        this.f42318d = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i10 = 0; i10 < i; i10++) {
            arrayList.add((y33) parcel.readParcelable(y33.class.getClassLoader()));
        }
        this.f42319e = Collections.unmodifiableList(arrayList);
        this.f42320f = parcel.createByteArray();
        this.f42321g = parcel.readString();
        this.f42322h = (byte[]) lb3.a((Object) parcel.createByteArray());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qj0)) {
            return false;
        }
        qj0 qj0Var = (qj0) obj;
        return this.f42316b.equals(qj0Var.f42316b) && this.f42317c.equals(qj0Var.f42317c) && lb3.a(this.f42318d, qj0Var.f42318d) && this.f42319e.equals(qj0Var.f42319e) && Arrays.equals(this.f42320f, qj0Var.f42320f) && lb3.a(this.f42321g, qj0Var.f42321g) && Arrays.equals(this.f42322h, qj0Var.f42322h);
    }

    public final int hashCode() {
        int iHashCode = (this.f42317c.hashCode() + (this.f42316b.hashCode() * VKApiCodes.CODE_CALL_LINK_OUTDATED)) * 31;
        String str = this.f42318d;
        int iHashCode2 = (Arrays.hashCode(this.f42320f) + ((this.f42319e.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f42321g;
        return Arrays.hashCode(this.f42322h) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.f42318d + StringUtils.PROCESS_POSTFIX_DELIMITER + this.f42316b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f42316b);
        parcel.writeString(this.f42317c.toString());
        parcel.writeString(this.f42318d);
        parcel.writeInt(this.f42319e.size());
        for (int i10 = 0; i10 < this.f42319e.size(); i10++) {
            parcel.writeParcelable((Parcelable) this.f42319e.get(i10), 0);
        }
        parcel.writeByteArray(this.f42320f);
        parcel.writeString(this.f42321g);
        parcel.writeByteArray(this.f42322h);
    }

    public qj0(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2) {
        int iA = lb3.a(uri, str2);
        if (iA == 0 || iA == 2 || iA == 1) {
            ni.a("customCacheKey must be null for type: " + iA, str3 == null);
        }
        this.f42316b = str;
        this.f42317c = uri;
        this.f42318d = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f42319e = Collections.unmodifiableList(arrayList);
        this.f42320f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f42321g = str3;
        this.f42322h = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : lb3.f40471f;
    }
}
