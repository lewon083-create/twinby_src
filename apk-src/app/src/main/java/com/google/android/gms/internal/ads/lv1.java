package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class lv1 implements Comparator, Parcelable {
    public static final Parcelable.Creator<lv1> CREATOR = new ji(25);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final av1[] f7650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7653e;

    public lv1(Parcel parcel) {
        this.f7652d = parcel.readString();
        av1[] av1VarArr = (av1[]) parcel.createTypedArray(av1.CREATOR);
        String str = cq0.f4293a;
        this.f7650b = av1VarArr;
        this.f7653e = av1VarArr.length;
    }

    public final lv1 a(String str) {
        return Objects.equals(this.f7652d, str) ? this : new lv1(str, false, this.f7650b);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        av1 av1Var = (av1) obj2;
        UUID uuid = gx0.f5925a;
        UUID uuid2 = ((av1) obj).f3435c;
        return uuid.equals(uuid2) ? !uuid.equals(av1Var.f3435c) ? 1 : 0 : uuid2.compareTo(av1Var.f3435c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lv1.class == obj.getClass()) {
            lv1 lv1Var = (lv1) obj;
            if (Objects.equals(this.f7652d, lv1Var.f7652d) && Arrays.equals(this.f7650b, lv1Var.f7650b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f7651c;
        if (i != 0) {
            return i;
        }
        String str = this.f7652d;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f7650b);
        this.f7651c = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7652d);
        parcel.writeTypedArray(this.f7650b, 0);
    }

    public lv1(String str, boolean z5, av1... av1VarArr) {
        this.f7652d = str;
        av1VarArr = z5 ? (av1[]) av1VarArr.clone() : av1VarArr;
        this.f7650b = av1VarArr;
        this.f7653e = av1VarArr.length;
        Arrays.sort(av1VarArr, this);
    }
}
