package com.google.android.material.datepicker;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import android.widget.RemoteViews;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import java.util.ArrayList;
import java.util.List;
import k6.b0;
import k6.o1;
import k6.q1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14559a;

    public /* synthetic */ a(int i) {
        this.f14559a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f14559a) {
            case 0:
                return new c((q) parcel.readParcelable(q.class.getClassLoader()), (q) parcel.readParcelable(q.class.getClassLoader()), (e) parcel.readParcelable(e.class.getClassLoader()), (q) parcel.readParcelable(q.class.getClassLoader()), parcel.readInt());
            case 1:
                return new e(parcel.readLong());
            case 2:
                return q.a(parcel.readInt(), parcel.readInt());
            case 3:
                int iS = i0.o.S(parcel);
                Bundle bundleI = null;
                while (parcel.dataPosition() < iS) {
                    int i = parcel.readInt();
                    if (((char) i) != 2) {
                        i0.o.O(parcel, i);
                    } else {
                        bundleI = i0.o.i(parcel, i);
                    }
                }
                i0.o.v(parcel, iS);
                return new com.google.firebase.messaging.x(bundleI);
            case 4:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new f.a(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            case 5:
                Intrinsics.checkNotNullParameter(parcel, "inParcel");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                Intrinsics.b(parcelable);
                return new f.i((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 6:
                int iS2 = i0.o.S(parcel);
                String strN = null;
                int iH = 0;
                while (parcel.dataPosition() < iS2) {
                    int i10 = parcel.readInt();
                    char c8 = (char) i10;
                    if (c8 == 1) {
                        strN = i0.o.n(parcel, i10);
                    } else if (c8 != 2) {
                        i0.o.O(parcel, i10);
                    } else {
                        iH = i0.o.H(parcel, i10);
                    }
                }
                i0.o.v(parcel, iS2);
                return new ga.c(strN, iH);
            case 7:
                int iS3 = i0.o.S(parcel);
                IBinder iBinderG = null;
                IBinder iBinderG2 = null;
                PendingIntent pendingIntent = null;
                String strN2 = null;
                int iH2 = 0;
                while (parcel.dataPosition() < iS3) {
                    int i11 = parcel.readInt();
                    char c9 = (char) i11;
                    if (c9 == 1) {
                        iH2 = i0.o.H(parcel, i11);
                    } else if (c9 == 2) {
                        iBinderG = i0.o.G(parcel, i11);
                    } else if (c9 == 3) {
                        iBinderG2 = i0.o.G(parcel, i11);
                    } else if (c9 == 4) {
                        pendingIntent = (PendingIntent) i0.o.m(parcel, i11, PendingIntent.CREATOR);
                    } else if (c9 != 6) {
                        i0.o.O(parcel, i11);
                    } else {
                        strN2 = i0.o.n(parcel, i11);
                    }
                }
                i0.o.v(parcel, iS3);
                return new gb.j(iH2, iBinderG, iBinderG2, pendingIntent, strN2);
            case 8:
                int iS4 = i0.o.S(parcel);
                long jI = Long.MAX_VALUE;
                LocationRequest locationRequest = null;
                ArrayList arrayListR = null;
                boolean zF = false;
                boolean zF2 = false;
                boolean zF3 = false;
                boolean zF4 = false;
                while (parcel.dataPosition() < iS4) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 1) {
                        locationRequest = (LocationRequest) i0.o.m(parcel, i12, LocationRequest.CREATOR);
                    } else if (c10 == 5) {
                        arrayListR = i0.o.r(parcel, i12, pa.f.CREATOR);
                    } else if (c10 == '\b') {
                        zF = i0.o.F(parcel, i12);
                    } else if (c10 != '\t') {
                        switch (c10) {
                            case 11:
                                zF3 = i0.o.F(parcel, i12);
                                break;
                            case '\f':
                                zF4 = i0.o.F(parcel, i12);
                                break;
                            case '\r':
                                i0.o.n(parcel, i12);
                                break;
                            case 14:
                                jI = i0.o.I(parcel, i12);
                                break;
                            default:
                                i0.o.O(parcel, i12);
                                break;
                        }
                    } else {
                        zF2 = i0.o.F(parcel, i12);
                    }
                }
                i0.o.v(parcel, iS4);
                return new gb.k(locationRequest, arrayListR, zF, zF2, zF3, zF4, jI);
            case 9:
                int iS5 = i0.o.S(parcel);
                gb.k kVar = null;
                IBinder iBinderG3 = null;
                IBinder iBinderG4 = null;
                PendingIntent pendingIntent2 = null;
                IBinder iBinderG5 = null;
                String strN3 = null;
                int iH3 = 1;
                while (parcel.dataPosition() < iS5) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            iH3 = i0.o.H(parcel, i13);
                            break;
                        case 2:
                            kVar = (gb.k) i0.o.m(parcel, i13, gb.k.CREATOR);
                            break;
                        case 3:
                            iBinderG3 = i0.o.G(parcel, i13);
                            break;
                        case 4:
                            pendingIntent2 = (PendingIntent) i0.o.m(parcel, i13, PendingIntent.CREATOR);
                            break;
                        case 5:
                            iBinderG4 = i0.o.G(parcel, i13);
                            break;
                        case 6:
                            iBinderG5 = i0.o.G(parcel, i13);
                            break;
                        case 7:
                        default:
                            i0.o.O(parcel, i13);
                            break;
                        case '\b':
                            strN3 = i0.o.n(parcel, i13);
                            break;
                    }
                }
                i0.o.v(parcel, iS5);
                return new gb.l(iH3, kVar, iBinderG3, iBinderG4, pendingIntent2, iBinderG5, strN3);
            case 10:
                int iS6 = i0.o.S(parcel);
                String strN4 = null;
                String strN5 = null;
                String strN6 = null;
                ArrayList arrayListR2 = null;
                gb.i iVar = null;
                int iH4 = 0;
                while (parcel.dataPosition() < iS6) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 1) {
                        iH4 = i0.o.H(parcel, i14);
                    } else if (c11 == 3) {
                        strN4 = i0.o.n(parcel, i14);
                    } else if (c11 == 4) {
                        strN5 = i0.o.n(parcel, i14);
                    } else if (c11 == 6) {
                        strN6 = i0.o.n(parcel, i14);
                    } else if (c11 == 7) {
                        iVar = (gb.i) i0.o.m(parcel, i14, gb.i.CREATOR);
                    } else if (c11 != '\b') {
                        i0.o.O(parcel, i14);
                    } else {
                        arrayListR2 = i0.o.r(parcel, i14, ma.d.CREATOR);
                    }
                }
                i0.o.v(parcel, iS6);
                return new gb.i(iH4, strN4, strN5, strN6, arrayListR2, iVar);
            case 11:
                int iS7 = i0.o.S(parcel);
                Status status = null;
                while (parcel.dataPosition() < iS7) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        i0.o.O(parcel, i15);
                    } else {
                        status = (Status) i0.o.m(parcel, i15, Status.CREATOR);
                    }
                }
                i0.o.v(parcel, iS7);
                return new gb.s(status);
            case 12:
                int iS8 = i0.o.S(parcel);
                String strN7 = null;
                Long lValueOf = null;
                ArrayList arrayListP = null;
                String strN8 = null;
                int iH5 = 0;
                boolean zF5 = false;
                boolean zF6 = false;
                while (parcel.dataPosition() < iS8) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            iH5 = i0.o.H(parcel, i16);
                            break;
                        case 2:
                            strN7 = i0.o.n(parcel, i16);
                            break;
                        case 3:
                            int iJ = i0.o.J(parcel, i16);
                            if (iJ != 0) {
                                i0.o.X(parcel, iJ, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                            } else {
                                lValueOf = null;
                            }
                            break;
                        case 4:
                            zF5 = i0.o.F(parcel, i16);
                            break;
                        case 5:
                            zF6 = i0.o.F(parcel, i16);
                            break;
                        case 6:
                            arrayListP = i0.o.p(parcel, i16);
                            break;
                        case 7:
                            strN8 = i0.o.n(parcel, i16);
                            break;
                        default:
                            i0.o.O(parcel, i16);
                            break;
                    }
                }
                i0.o.v(parcel, iS8);
                return new TokenData(iH5, strN7, lValueOf, zF5, zF6, arrayListP, strN8);
            case 13:
                j2.g gVar = new j2.g(parcel);
                gVar.f26201b = parcel.readInt();
                return gVar;
            case 14:
                int iS9 = i0.o.S(parcel);
                String strN9 = null;
                String strN10 = null;
                String strN11 = null;
                String strN12 = null;
                Uri uri = null;
                String strN13 = null;
                String strN14 = null;
                ArrayList arrayListR3 = null;
                String strN15 = null;
                String strN16 = null;
                long jI2 = 0;
                while (parcel.dataPosition() < iS9) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 2:
                            strN9 = i0.o.n(parcel, i17);
                            break;
                        case 3:
                            strN10 = i0.o.n(parcel, i17);
                            break;
                        case 4:
                            strN11 = i0.o.n(parcel, i17);
                            break;
                        case 5:
                            strN12 = i0.o.n(parcel, i17);
                            break;
                        case 6:
                            uri = (Uri) i0.o.m(parcel, i17, Uri.CREATOR);
                            break;
                        case 7:
                            strN13 = i0.o.n(parcel, i17);
                            break;
                        case '\b':
                            jI2 = i0.o.I(parcel, i17);
                            break;
                        case '\t':
                            strN14 = i0.o.n(parcel, i17);
                            break;
                        case '\n':
                            arrayListR3 = i0.o.r(parcel, i17, Scope.CREATOR);
                            break;
                        case 11:
                            strN15 = i0.o.n(parcel, i17);
                            break;
                        case '\f':
                            strN16 = i0.o.n(parcel, i17);
                            break;
                        default:
                            i0.o.O(parcel, i17);
                            break;
                    }
                }
                i0.o.v(parcel, iS9);
                return new GoogleSignInAccount(strN9, strN10, strN11, strN12, uri, strN13, jI2, strN14, arrayListR3, strN15, strN16);
            case 15:
                int iS10 = i0.o.S(parcel);
                ArrayList arrayListR4 = null;
                ArrayList arrayListR5 = null;
                Account account = null;
                String strN17 = null;
                String strN18 = null;
                String strN19 = null;
                int iH6 = 0;
                boolean zF7 = false;
                boolean zF8 = false;
                boolean zF9 = false;
                while (parcel.dataPosition() < iS10) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            iH6 = i0.o.H(parcel, i18);
                            break;
                        case 2:
                            arrayListR5 = i0.o.r(parcel, i18, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) i0.o.m(parcel, i18, Account.CREATOR);
                            break;
                        case 4:
                            zF7 = i0.o.F(parcel, i18);
                            break;
                        case 5:
                            zF8 = i0.o.F(parcel, i18);
                            break;
                        case 6:
                            zF9 = i0.o.F(parcel, i18);
                            break;
                        case 7:
                            strN17 = i0.o.n(parcel, i18);
                            break;
                        case '\b':
                            strN18 = i0.o.n(parcel, i18);
                            break;
                        case '\t':
                            arrayListR4 = i0.o.r(parcel, i18, ka.a.CREATOR);
                            break;
                        case '\n':
                            strN19 = i0.o.n(parcel, i18);
                            break;
                        default:
                            i0.o.O(parcel, i18);
                            break;
                    }
                }
                i0.o.v(parcel, iS10);
                return new GoogleSignInOptions(iH6, arrayListR5, account, zF7, zF8, zF9, strN17, strN18, GoogleSignInOptions.c(arrayListR4), strN19);
            case 16:
                int iS11 = i0.o.S(parcel);
                String strN20 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String strN21 = "";
                while (parcel.dataPosition() < iS11) {
                    int i19 = parcel.readInt();
                    char c12 = (char) i19;
                    if (c12 == 4) {
                        strN20 = i0.o.n(parcel, i19);
                    } else if (c12 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) i0.o.m(parcel, i19, GoogleSignInAccount.CREATOR);
                    } else if (c12 != '\b') {
                        i0.o.O(parcel, i19);
                    } else {
                        strN21 = i0.o.n(parcel, i19);
                    }
                }
                i0.o.v(parcel, iS11);
                return new SignInAccount(strN20, googleSignInAccount, strN21);
            case 17:
                int iS12 = i0.o.S(parcel);
                byte[] bArrJ = null;
                while (parcel.dataPosition() < iS12) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 2) {
                        i0.o.O(parcel, i20);
                    } else {
                        bArrJ = i0.o.j(parcel, i20);
                    }
                }
                i0.o.v(parcel, iS12);
                jb.d dVar = new jb.d();
                dVar.f26596b = bArrJ;
                return dVar;
            case 18:
                int iS13 = i0.o.S(parcel);
                byte[] bArrJ2 = null;
                while (parcel.dataPosition() < iS13) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 2) {
                        i0.o.O(parcel, i21);
                    } else {
                        bArrJ2 = i0.o.j(parcel, i21);
                    }
                }
                i0.o.v(parcel, iS13);
                jb.e eVar = new jb.e();
                eVar.f26597b = bArrJ2;
                return eVar;
            case 19:
                int iS14 = i0.o.S(parcel);
                byte[] bArrJ3 = null;
                while (parcel.dataPosition() < iS14) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 1) {
                        i0.o.O(parcel, i22);
                    } else {
                        bArrJ3 = i0.o.j(parcel, i22);
                    }
                }
                i0.o.v(parcel, iS14);
                jb.f fVar = new jb.f();
                fVar.f26598b = bArrJ3;
                return fVar;
            case 20:
                int iS15 = i0.o.S(parcel);
                String[] strArrO = null;
                int[] iArrK = null;
                RemoteViews remoteViews = null;
                byte[] bArrJ4 = null;
                while (parcel.dataPosition() < iS15) {
                    int i23 = parcel.readInt();
                    char c13 = (char) i23;
                    if (c13 == 1) {
                        strArrO = i0.o.o(parcel, i23);
                    } else if (c13 == 2) {
                        iArrK = i0.o.k(parcel, i23);
                    } else if (c13 == 3) {
                        remoteViews = (RemoteViews) i0.o.m(parcel, i23, RemoteViews.CREATOR);
                    } else if (c13 != 4) {
                        i0.o.O(parcel, i23);
                    } else {
                        bArrJ4 = i0.o.j(parcel, i23);
                    }
                }
                i0.o.v(parcel, iS15);
                jb.g gVar2 = new jb.g();
                gVar2.f26599b = strArrO;
                gVar2.f26600c = iArrK;
                gVar2.f26601d = remoteViews;
                gVar2.f26602e = bArrJ4;
                return gVar2;
            case 21:
                b0 b0Var = new b0();
                b0Var.f27037b = parcel.readInt();
                b0Var.f27038c = parcel.readInt();
                b0Var.f27039d = parcel.readInt() == 1;
                return b0Var;
            case 22:
                o1 o1Var = new o1();
                o1Var.f27147b = parcel.readInt();
                o1Var.f27148c = parcel.readInt();
                o1Var.f27150e = parcel.readInt() == 1;
                int i24 = parcel.readInt();
                if (i24 > 0) {
                    int[] iArr = new int[i24];
                    o1Var.f27149d = iArr;
                    parcel.readIntArray(iArr);
                }
                return o1Var;
            case 23:
                q1 q1Var = new q1();
                q1Var.f27156b = parcel.readInt();
                q1Var.f27157c = parcel.readInt();
                int i25 = parcel.readInt();
                q1Var.f27158d = i25;
                if (i25 > 0) {
                    int[] iArr2 = new int[i25];
                    q1Var.f27159e = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i26 = parcel.readInt();
                q1Var.f27160f = i26;
                if (i26 > 0) {
                    int[] iArr3 = new int[i26];
                    q1Var.f27161g = iArr3;
                    parcel.readIntArray(iArr3);
                }
                q1Var.i = parcel.readInt() == 1;
                q1Var.f27163j = parcel.readInt() == 1;
                q1Var.f27164k = parcel.readInt() == 1;
                q1Var.f27162h = parcel.readArrayList(o1.class.getClassLoader());
                return q1Var;
            case 24:
                int iS16 = i0.o.S(parcel);
                Bundle bundleI2 = null;
                int iH7 = 0;
                int iH8 = 0;
                while (parcel.dataPosition() < iS16) {
                    int i27 = parcel.readInt();
                    char c14 = (char) i27;
                    if (c14 == 1) {
                        iH7 = i0.o.H(parcel, i27);
                    } else if (c14 == 2) {
                        iH8 = i0.o.H(parcel, i27);
                    } else if (c14 != 3) {
                        i0.o.O(parcel, i27);
                    } else {
                        bundleI2 = i0.o.i(parcel, i27);
                    }
                }
                i0.o.v(parcel, iS16);
                return new ka.a(iH7, iH8, bundleI2);
            case 25:
                int iS17 = i0.o.S(parcel);
                String strN22 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iS17) {
                    int i28 = parcel.readInt();
                    char c15 = (char) i28;
                    if (c15 == 2) {
                        strN22 = i0.o.n(parcel, i28);
                    } else if (c15 != 5) {
                        i0.o.O(parcel, i28);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) i0.o.m(parcel, i28, GoogleSignInOptions.CREATOR);
                    }
                }
                i0.o.v(parcel, iS17);
                return new SignInConfiguration(strN22, googleSignInOptions);
            case 26:
                int iS18 = i0.o.S(parcel);
                gb.i iVar2 = null;
                int iH9 = 0;
                boolean zF10 = false;
                long jI3 = Long.MAX_VALUE;
                while (parcel.dataPosition() < iS18) {
                    int i29 = parcel.readInt();
                    char c16 = (char) i29;
                    if (c16 == 1) {
                        jI3 = i0.o.I(parcel, i29);
                    } else if (c16 == 2) {
                        iH9 = i0.o.H(parcel, i29);
                    } else if (c16 == 3) {
                        zF10 = i0.o.F(parcel, i29);
                    } else if (c16 != 5) {
                        i0.o.O(parcel, i29);
                    } else {
                        iVar2 = (gb.i) i0.o.m(parcel, i29, gb.i.CREATOR);
                    }
                }
                i0.o.v(parcel, iS18);
                return new kb.b(jI3, iH9, zF10, iVar2);
            case 27:
                int iS19 = i0.o.S(parcel);
                kb.k[] kVarArr = null;
                long jI4 = 0;
                int iH10 = 1;
                int iH11 = 1;
                int iH12 = 1000;
                while (parcel.dataPosition() < iS19) {
                    int i30 = parcel.readInt();
                    switch ((char) i30) {
                        case 1:
                            iH10 = i0.o.H(parcel, i30);
                            break;
                        case 2:
                            iH11 = i0.o.H(parcel, i30);
                            break;
                        case 3:
                            jI4 = i0.o.I(parcel, i30);
                            break;
                        case 4:
                            iH12 = i0.o.H(parcel, i30);
                            break;
                        case 5:
                            kVarArr = (kb.k[]) i0.o.q(parcel, i30, kb.k.CREATOR);
                            break;
                        case 6:
                            i0.o.F(parcel, i30);
                            break;
                        default:
                            i0.o.O(parcel, i30);
                            break;
                    }
                }
                i0.o.v(parcel, iS19);
                return new LocationAvailability(iH12, iH10, iH11, jI4, kVarArr);
            case 28:
                int iS20 = i0.o.S(parcel);
                WorkSource workSource = new WorkSource();
                gb.i iVar3 = null;
                boolean zF11 = false;
                int iH13 = 0;
                int iH14 = 0;
                boolean zF12 = false;
                long jI5 = -1;
                float f10 = 0.0f;
                int iH15 = Integer.MAX_VALUE;
                long jI6 = Long.MAX_VALUE;
                long jI7 = Long.MAX_VALUE;
                long jI8 = 0;
                long jI9 = 600000;
                long jI10 = 3600000;
                int iH16 = 102;
                while (parcel.dataPosition() < iS20) {
                    int i31 = parcel.readInt();
                    switch ((char) i31) {
                        case 1:
                            iH16 = i0.o.H(parcel, i31);
                            break;
                        case 2:
                            jI10 = i0.o.I(parcel, i31);
                            break;
                        case 3:
                            jI9 = i0.o.I(parcel, i31);
                            break;
                        case 4:
                        case 14:
                        default:
                            i0.o.O(parcel, i31);
                            break;
                        case 5:
                            jI6 = i0.o.I(parcel, i31);
                            break;
                        case 6:
                            iH15 = i0.o.H(parcel, i31);
                            break;
                        case 7:
                            i0.o.W(parcel, i31, 4);
                            f10 = parcel.readFloat();
                            break;
                        case '\b':
                            jI8 = i0.o.I(parcel, i31);
                            break;
                        case '\t':
                            zF11 = i0.o.F(parcel, i31);
                            break;
                        case '\n':
                            jI7 = i0.o.I(parcel, i31);
                            break;
                        case 11:
                            jI5 = i0.o.I(parcel, i31);
                            break;
                        case '\f':
                            iH13 = i0.o.H(parcel, i31);
                            break;
                        case '\r':
                            iH14 = i0.o.H(parcel, i31);
                            break;
                        case 15:
                            zF12 = i0.o.F(parcel, i31);
                            break;
                        case 16:
                            workSource = (WorkSource) i0.o.m(parcel, i31, WorkSource.CREATOR);
                            break;
                        case 17:
                            iVar3 = (gb.i) i0.o.m(parcel, i31, gb.i.CREATOR);
                            break;
                    }
                }
                i0.o.v(parcel, iS20);
                return new LocationRequest(iH16, jI10, jI9, jI8, jI6, jI7, iH15, f10, zF11, jI5, iH13, iH14, zF12, workSource, iVar3);
            default:
                int iS21 = i0.o.S(parcel);
                List listR = LocationResult.f14413c;
                while (parcel.dataPosition() < iS21) {
                    int i32 = parcel.readInt();
                    if (((char) i32) != 1) {
                        i0.o.O(parcel, i32);
                    } else {
                        listR = i0.o.r(parcel, i32, Location.CREATOR);
                    }
                }
                i0.o.v(parcel, iS21);
                return new LocationResult(listR);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f14559a) {
            case 0:
                return new c[i];
            case 1:
                return new e[i];
            case 2:
                return new q[i];
            case 3:
                return new com.google.firebase.messaging.x[i];
            case 4:
                return new f.a[i];
            case 5:
                return new f.i[i];
            case 6:
                return new ga.c[i];
            case 7:
                return new gb.j[i];
            case 8:
                return new gb.k[i];
            case 9:
                return new gb.l[i];
            case 10:
                return new gb.i[i];
            case 11:
                return new gb.s[i];
            case 12:
                return new TokenData[i];
            case 13:
                return new j2.g[i];
            case 14:
                return new GoogleSignInAccount[i];
            case 15:
                return new GoogleSignInOptions[i];
            case 16:
                return new SignInAccount[i];
            case 17:
                return new jb.d[i];
            case 18:
                return new jb.e[i];
            case 19:
                return new jb.f[i];
            case 20:
                return new jb.g[i];
            case 21:
                return new b0[i];
            case 22:
                return new o1[i];
            case 23:
                return new q1[i];
            case 24:
                return new ka.a[i];
            case 25:
                return new SignInConfiguration[i];
            case 26:
                return new kb.b[i];
            case 27:
                return new LocationAvailability[i];
            case 28:
                return new LocationRequest[i];
            default:
                return new LocationResult[i];
        }
    }
}
