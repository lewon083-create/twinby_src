package io.flutter.plugins.firebase.messaging;

import bb.e;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class FlutterFirebaseMessagingBackgroundService extends a {
    public static final List i = Collections.synchronizedList(new LinkedList());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static e f25770j;

    @Override // io.flutter.plugins.firebase.messaging.a, android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (f25770j == null) {
            f25770j = new e(21);
        }
        e eVar = f25770j;
        if (((AtomicBoolean) eVar.f2019c).get()) {
            return;
        }
        long j10 = a.a.f10b.getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("callback_handle", 0L);
        if (j10 != 0) {
            eVar.H(j10, null);
        }
    }
}
