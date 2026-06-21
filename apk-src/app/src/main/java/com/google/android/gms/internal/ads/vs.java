package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vs implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ws f11451c;

    public /* synthetic */ vs(ws wsVar, int i) {
        this.f11450b = i;
        this.f11451c = wsVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f11450b) {
            case 0:
                ws wsVar = this.f11451c;
                wsVar.getClass();
                Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
                data.putExtra("title", wsVar.f11884g);
                data.putExtra("eventLocation", wsVar.f11887k);
                data.putExtra("description", wsVar.f11886j);
                long j10 = wsVar.f11885h;
                if (j10 > -1) {
                    data.putExtra("beginTime", j10);
                }
                long j11 = wsVar.i;
                if (j11 > -1) {
                    data.putExtra("endTime", j11);
                }
                data.setFlags(268435456);
                t9.g0 g0Var = p9.k.C.f31297c;
                t9.g0.u(wsVar.f11883f, data);
                break;
            default:
                this.f11451c.z("Operation denied by user.");
                break;
        }
    }
}
