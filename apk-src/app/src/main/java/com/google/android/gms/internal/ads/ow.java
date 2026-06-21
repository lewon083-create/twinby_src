package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ow extends ug implements pw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8821b = 0;

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        xa.b bVar;
        mw kwVar = null;
        switch (i) {
            case 1:
                xa.a aVarL1 = xa.b.L1(parcel.readStrongBinder());
                tw twVar = (tw) vg.b(parcel, tw.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    kwVar = iInterfaceQueryLocalInterface instanceof mw ? (mw) iInterfaceQueryLocalInterface : new kw(strongBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback", 1);
                }
                vg.f(parcel);
                ((aa.l) this).q3(aVarL1, twVar, kwVar);
                parcel2.writeNoException();
                return true;
            case 2:
                xa.a aVarL12 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                aa.l lVar = (aa.l) this;
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3256w8)).booleanValue()) {
                    MotionEvent motionEvent = (MotionEvent) xa.b.X1(aVarL12);
                    vt vtVar = lVar.f628j;
                    View view = vtVar != null ? vtVar.f11464b : null;
                    int[] iArr = new int[2];
                    if (view != null) {
                        view.getLocationOnScreen(iArr);
                    }
                    lVar.f629k = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
                    if (motionEvent.getAction() == 0) {
                        lVar.f630l = lVar.f629k;
                    }
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    Point point = lVar.f629k;
                    motionEventObtain.setLocation(point.x, point.y);
                    lVar.f624e.f12136b.b(motionEventObtain);
                    motionEventObtain.recycle();
                }
                parcel2.writeNoException();
                return true;
            case 3:
                xa.b.L1(parcel.readStrongBinder());
                xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 4:
                xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                xa.a aVarL13 = xa.b.L1(parcel.readStrongBinder());
                st stVarL4 = rt.l4(parcel.readStrongBinder());
                vg.f(parcel);
                ((aa.l) this).l4(arrayListCreateTypedArrayList, aVarL13, stVarL4, false);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                xa.a aVarL14 = xa.b.L1(parcel.readStrongBinder());
                st stVarL42 = rt.l4(parcel.readStrongBinder());
                vg.f(parcel);
                ((aa.l) this).m4(arrayListCreateTypedArrayList2, aVarL14, stVarL42, false);
                parcel2.writeNoException();
                return true;
            case 7:
                vt vtVar2 = (vt) vg.b(parcel, vt.CREATOR);
                vg.f(parcel);
                aa.l lVar2 = (aa.l) this;
                lVar2.f628j = vtVar2;
                lVar2.f626g.a(1);
                parcel2.writeNoException();
                return true;
            case 8:
                xa.a aVarL15 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                ((aa.l) this).V(aVarL15);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                xa.a aVarL16 = xa.b.L1(parcel.readStrongBinder());
                st stVarL43 = rt.l4(parcel.readStrongBinder());
                vg.f(parcel);
                ((aa.l) this).l4(arrayListCreateTypedArrayList3, aVarL16, stVarL43, true);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                xa.a aVarL17 = xa.b.L1(parcel.readStrongBinder());
                st stVarL44 = rt.l4(parcel.readStrongBinder());
                vg.f(parcel);
                ((aa.l) this).m4(arrayListCreateTypedArrayList4, aVarL17, stVarL44, true);
                parcel2.writeNoException();
                return true;
            case 11:
                xa.a aVarL18 = xa.b.L1(parcel.readStrongBinder());
                xa.a aVarL19 = xa.b.L1(parcel.readStrongBinder());
                String string = parcel.readString();
                xa.a aVarL110 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                aa.l lVar3 = (aa.l) this;
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f2943bb)).booleanValue()) {
                    Context context = (Context) xa.b.X1(aVarL18);
                    q.g gVar = (q.g) xa.b.X1(aVarL19);
                    q.a aVar = (q.a) xa.b.X1(aVarL110);
                    ll llVar = lVar3.F;
                    llVar.getClass();
                    if (context == null) {
                        throw new IllegalArgumentException("App Context parameter is null");
                    }
                    if (TextUtils.isEmpty(string)) {
                        throw new IllegalArgumentException("Origin parameter is empty or null");
                    }
                    if (gVar == null) {
                        throw new IllegalArgumentException("CustomTabsClient parameter is null");
                    }
                    llVar.f7568l = context;
                    llVar.f7565h = string;
                    wd0 wd0Var = llVar.f7561d;
                    kl klVar = new kl(llVar, aVar, wd0Var);
                    llVar.f7563f = klVar;
                    com.google.firebase.messaging.y yVarC = gVar.c(klVar);
                    llVar.f7564g = yVarC;
                    if (yVarC == null) {
                        u9.i.e("CustomTabsClient failed to create new session.");
                    }
                    hl.l.z(wd0Var, "pact_action", new Pair("pe", "pact_init"));
                    if (((Boolean) gm.f5858e.r()).booleanValue()) {
                        aa.i0 i0Var = lVar3.G;
                        synchronized (i0Var) {
                            i0Var.c(true);
                            i0Var.c(false);
                        }
                    }
                    if (((Boolean) gm.f5856c.r()).booleanValue()) {
                        lVar3.H.a(null);
                    }
                    bVar = new xa.b(llVar.f7564g);
                } else {
                    bVar = new xa.b(null);
                }
                parcel2.writeNoException();
                vg.e(parcel2, bVar);
                return true;
            default:
                return false;
        }
    }
}
