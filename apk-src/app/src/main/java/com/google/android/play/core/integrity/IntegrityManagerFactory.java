package com.google.android.play.core.integrity;

import android.content.Context;
import ni.i;
import sc.j;
import xc.f;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class IntegrityManagerFactory {
    public static IntegrityManager create(Context context) {
        i iVar;
        synchronized (j.class) {
            try {
                if (j.f32902a == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    j.f32902a = new i(context);
                }
                iVar = j.f32902a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (IntegrityManager) ((f) iVar.f29407c).a();
    }
}
