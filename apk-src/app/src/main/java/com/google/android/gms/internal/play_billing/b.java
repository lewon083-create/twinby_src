package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends cb.a implements d {
    public final Bundle S3(String str, String str2, Bundle bundle) {
        Parcel parcelE2 = e2();
        parcelE2.writeInt(9);
        parcelE2.writeString(str);
        parcelE2.writeString(str2);
        int i = e.f14164a;
        parcelE2.writeInt(1);
        bundle.writeToParcel(parcelE2, 0);
        Parcel parcelI2 = i2(parcelE2, 12);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) e.a(parcelI2);
        parcelI2.recycle();
        return bundle2;
    }

    public final int d3(int i, String str, String str2, Bundle bundle) {
        Parcel parcelE2 = e2();
        parcelE2.writeInt(i);
        parcelE2.writeString(str);
        parcelE2.writeString(str2);
        int i10 = e.f14164a;
        parcelE2.writeInt(1);
        bundle.writeToParcel(parcelE2, 0);
        Parcel parcelI2 = i2(parcelE2, 10);
        int i11 = parcelI2.readInt();
        parcelI2.recycle();
        return i11;
    }

    public final Bundle k4(String str, String str2, String str3) {
        Parcel parcelE2 = e2();
        parcelE2.writeInt(3);
        parcelE2.writeString(str);
        parcelE2.writeString(str2);
        parcelE2.writeString(str3);
        parcelE2.writeString(null);
        Parcel parcelI2 = i2(parcelE2, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) e.a(parcelI2);
        parcelI2.recycle();
        return bundle;
    }

    public final Bundle l4(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelE2 = e2();
        parcelE2.writeInt(i);
        parcelE2.writeString(str);
        parcelE2.writeString(str2);
        parcelE2.writeString(str3);
        parcelE2.writeString(null);
        int i10 = e.f14164a;
        parcelE2.writeInt(1);
        bundle.writeToParcel(parcelE2, 0);
        Parcel parcelI2 = i2(parcelE2, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) e.a(parcelI2);
        parcelI2.recycle();
        return bundle2;
    }

    public final Bundle m4(String str, String str2, String str3, Bundle bundle) {
        Parcel parcelE2 = e2();
        parcelE2.writeInt(6);
        parcelE2.writeString(str);
        parcelE2.writeString(str2);
        parcelE2.writeString(str3);
        int i = e.f14164a;
        parcelE2.writeInt(1);
        bundle.writeToParcel(parcelE2, 0);
        Parcel parcelI2 = i2(parcelE2, 9);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) e.a(parcelI2);
        parcelI2.recycle();
        return bundle2;
    }

    public final Bundle n4(String str, String str2, String str3) {
        Parcel parcelE2 = e2();
        parcelE2.writeInt(3);
        parcelE2.writeString(str);
        parcelE2.writeString(str2);
        parcelE2.writeString(str3);
        Parcel parcelI2 = i2(parcelE2, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) e.a(parcelI2);
        parcelI2.recycle();
        return bundle;
    }

    public final Bundle o4(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelE2 = e2();
        parcelE2.writeInt(i);
        parcelE2.writeString(str);
        parcelE2.writeString(str2);
        parcelE2.writeString(str3);
        int i10 = e.f14164a;
        parcelE2.writeInt(1);
        bundle.writeToParcel(parcelE2, 0);
        Parcel parcelI2 = i2(parcelE2, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) e.a(parcelI2);
        parcelI2.recycle();
        return bundle2;
    }

    public final Bundle p4(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelE2 = e2();
        parcelE2.writeInt(i);
        parcelE2.writeString(str);
        parcelE2.writeString(str2);
        int i10 = e.f14164a;
        parcelE2.writeInt(1);
        bundle.writeToParcel(parcelE2, 0);
        parcelE2.writeInt(1);
        bundle2.writeToParcel(parcelE2, 0);
        Parcel parcelI2 = i2(parcelE2, VKApiCodes.CODE_MSG_SEND_RECIPIENT_FORBID_GROUPS_MSGS);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) e.a(parcelI2);
        parcelI2.recycle();
        return bundle3;
    }

    public final void q4(String str, Bundle bundle, d8.a0 a0Var) {
        Parcel parcelE2 = e2();
        parcelE2.writeInt(21);
        parcelE2.writeString(str);
        int i = e.f14164a;
        parcelE2.writeInt(1);
        bundle.writeToParcel(parcelE2, 0);
        parcelE2.writeStrongBinder(a0Var);
        A2(parcelE2, 1501);
    }

    public final Bundle r3(String str, String str2, Bundle bundle) {
        Parcel parcelE2 = e2();
        parcelE2.writeInt(9);
        parcelE2.writeString(str);
        parcelE2.writeString(str2);
        int i = e.f14164a;
        parcelE2.writeInt(1);
        bundle.writeToParcel(parcelE2, 0);
        Parcel parcelI2 = i2(parcelE2, VKApiCodes.CODE_MSG_SEND_VIOLATION_OF_PRIVACY_SETTINGS);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) e.a(parcelI2);
        parcelI2.recycle();
        return bundle2;
    }

    public final void r4(String str, Bundle bundle, d8.b0 b0Var) {
        Parcel parcelE2 = e2();
        parcelE2.writeInt(21);
        parcelE2.writeString(str);
        int i = e.f14164a;
        parcelE2.writeInt(1);
        bundle.writeToParcel(parcelE2, 0);
        parcelE2.writeStrongBinder(b0Var);
        A2(parcelE2, 1601);
    }

    public final void s4(String str, Bundle bundle, d8.a0 a0Var) {
        Parcel parcelE2 = e2();
        parcelE2.writeInt(18);
        parcelE2.writeString(str);
        int i = e.f14164a;
        parcelE2.writeInt(1);
        bundle.writeToParcel(parcelE2, 0);
        parcelE2.writeStrongBinder(a0Var);
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f2256c.transact(1301, parcelE2, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcelE2.recycle();
            parcelObtain.recycle();
        }
    }

    public final void t4(String str, Bundle bundle, d8.a0 a0Var) {
        Parcel parcelE2 = e2();
        parcelE2.writeInt(21);
        parcelE2.writeString(str);
        int i = e.f14164a;
        parcelE2.writeInt(1);
        bundle.writeToParcel(parcelE2, 0);
        parcelE2.writeStrongBinder(a0Var);
        A2(parcelE2, VKApiCodes.CODE_ERROR_MARKET_COMMENTS_CLOSED);
    }
}
