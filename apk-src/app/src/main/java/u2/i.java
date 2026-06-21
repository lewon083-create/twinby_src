package u2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.u;
import oa.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.p f34037b;

    public i(EmojiCompatInitializer emojiCompatInitializer, androidx.lifecycle.p pVar) {
        this.f34037b = pVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(u uVar) {
        (Build.VERSION.SDK_INT >= 28 ? a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new w(2), 500L);
        this.f34037b.b(this);
    }
}
