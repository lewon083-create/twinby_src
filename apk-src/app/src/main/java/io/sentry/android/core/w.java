package io.sentry.android.core;

import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f25956c;

    public /* synthetic */ w(KeyEvent.Callback callback, int i) {
        this.f25955b = i;
        this.f25956c = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f25955b) {
            case 0:
                ((SentryUserFeedbackButton) this.f25956c).lambda$setOnClickListener$0(view);
                break;
            default:
                ((SentryUserFeedbackForm) this.f25956c).lambda$onCreate$3(view);
                break;
        }
    }
}
