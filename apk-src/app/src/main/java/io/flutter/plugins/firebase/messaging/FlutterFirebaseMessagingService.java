package io.flutter.plugins.firebase.messaging;

import androidx.lifecycle.d0;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class FlutterFirebaseMessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String str) {
        if (d0.f1549m == null) {
            d0.f1549m = new d0();
        }
        d0.f1549m.i(str);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(x xVar) {
    }
}
