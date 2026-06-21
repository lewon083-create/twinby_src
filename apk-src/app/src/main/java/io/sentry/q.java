package io.sentry;

import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26074b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f26075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ISerializer f26076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f26077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f26078f;

    public /* synthetic */ q(Attachment attachment, long j10, ISerializer iSerializer, ILogger iLogger) {
        this.f26077e = attachment;
        this.f26075c = j10;
        this.f26076d = iSerializer;
        this.f26078f = iLogger;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f26074b) {
            case 0:
                return SentryEnvelopeItem.lambda$fromProfilingTrace$18((File) this.f26077e, this.f26075c, (ProfilingTraceData) this.f26078f, this.f26076d);
            default:
                return SentryEnvelopeItem.lambda$fromAttachment$12((Attachment) this.f26077e, this.f26075c, this.f26076d, (ILogger) this.f26078f);
        }
    }

    public /* synthetic */ q(File file, long j10, ProfilingTraceData profilingTraceData, ISerializer iSerializer) {
        this.f26077e = file;
        this.f26075c = j10;
        this.f26078f = profilingTraceData;
        this.f26076d = iSerializer;
    }
}
