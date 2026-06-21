package io.sentry;

import io.sentry.SentryEnvelopeItem;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26063c;

    public /* synthetic */ p(int i, Object obj) {
        this.f26062b = i;
        this.f26063c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f26062b) {
            case 0:
                return SentryEnvelopeItem.lambda$fromProfileChunk$16((SentryEnvelopeItem.CachedItem) this.f26063c);
            case 1:
                return ((SentryEnvelopeItem.CachedItem) this.f26063c).getBytes();
            case 2:
                return SentryEnvelopeItem.lambda$fromProfilingTrace$19((SentryEnvelopeItem.CachedItem) this.f26063c);
            case 3:
                return ((SentryEnvelopeItem.CachedItem) this.f26063c).getBytes();
            case 4:
                return SentryEnvelopeItem.lambda$fromSession$1((SentryEnvelopeItem.CachedItem) this.f26063c);
            case 5:
                return ((SentryEnvelopeItem.CachedItem) this.f26063c).getBytes();
            case 6:
                return SentryEnvelopeItem.lambda$fromEvent$4((SentryEnvelopeItem.CachedItem) this.f26063c);
            case 7:
                return SentryEnvelopeItem.lambda$fromReplay$25((SentryEnvelopeItem.CachedItem) this.f26063c);
            case 8:
                return ((SentryEnvelopeItem.CachedItem) this.f26063c).getBytes();
            case 9:
                return SentryEnvelopeItem.lambda$fromUserFeedback$7((SentryEnvelopeItem.CachedItem) this.f26063c);
            case 10:
                return ((SentryEnvelopeItem.CachedItem) this.f26063c).getBytes();
            case 11:
                return SentryEnvelopeItem.lambda$fromClientReport$22((SentryEnvelopeItem.CachedItem) this.f26063c);
            case 12:
                return ((SentryEnvelopeItem.CachedItem) this.f26063c).getBytes();
            case 13:
                return SentryEnvelopeItem.lambda$fromCheckIn$10((SentryEnvelopeItem.CachedItem) this.f26063c);
            case 14:
                return ((SentryEnvelopeItem.CachedItem) this.f26063c).getBytes();
            case 15:
                return ((SentryEnvelopeItem.CachedItem) this.f26063c).getBytes();
            case 16:
                return SentryEnvelopeItem.lambda$fromLogs$28((SentryEnvelopeItem.CachedItem) this.f26063c);
            case 17:
                return ((SentryEnvelopeItem.CachedItem) this.f26063c).getBytes();
            case 18:
                return SentryEnvelopeItem.lambda$fromMetrics$31((SentryEnvelopeItem.CachedItem) this.f26063c);
            case 19:
                return ((SentryEnvelopeItem.CachedItem) this.f26063c).getBytes();
            case 20:
                return SentryEnvelopeItem.lambda$fromAttachment$13((SentryEnvelopeItem.CachedItem) this.f26063c);
            case 21:
                return ((SentryEnvelopeItem.CachedItem) this.f26063c).getBytes();
            default:
                return ((HostnameCache) this.f26063c).lambda$updateCache$1();
        }
    }
}
