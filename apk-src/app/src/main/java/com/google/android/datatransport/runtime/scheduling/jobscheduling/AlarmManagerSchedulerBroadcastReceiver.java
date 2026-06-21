package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.appsflyer.internal.m;
import com.google.android.gms.internal.consent_sdk.c;
import e1.r;
import i9.a;
import java.util.concurrent.Executor;
import x7.b;
import y8.j;
import y8.q;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2524a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        q.b(context);
        b bVarA = j.a();
        bVarA.d(queryParameter);
        bVarA.f35979d = a.b(iIntValue);
        if (queryParameter2 != null) {
            bVarA.f35978c = Base64.decode(queryParameter2, 0);
        }
        c cVar = q.a().f36572d;
        ((Executor) cVar.f13341e).execute(new r(cVar, bVarA.a(), i, new m(1)));
    }
}
