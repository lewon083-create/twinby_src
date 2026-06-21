package com.yandex.div.json;

import androidx.annotation.NonNull;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.Log;
import com.yandex.div.json.ParsingErrorLogger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface ParsingErrorLogger {
    public static final ParsingErrorLogger ASSERT;
    public static final ParsingErrorLogger LOG;

    static {
        final int i = 0;
        LOG = new ParsingErrorLogger() { // from class: dh.a
            @Override // com.yandex.div.json.ParsingErrorLogger
            public final void logError(Exception exc) {
                switch (i) {
                    case 0:
                        ParsingErrorLogger.lambda$static$0(exc);
                        break;
                    default:
                        ParsingErrorLogger.lambda$static$1(exc);
                        break;
                }
            }
        };
        final int i10 = 1;
        ASSERT = new ParsingErrorLogger() { // from class: dh.a
            @Override // com.yandex.div.json.ParsingErrorLogger
            public final void logError(Exception exc) {
                switch (i10) {
                    case 0:
                        ParsingErrorLogger.lambda$static$0(exc);
                        break;
                    default:
                        ParsingErrorLogger.lambda$static$1(exc);
                        break;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$0(Exception exc) {
        if (Log.isEnabled()) {
            Log.e("ParsingErrorLogger", "An error occurred during parsing process", exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$1(Exception exc) {
        if (Assert.isEnabled()) {
            Assert.fail(exc.getMessage(), exc);
        }
    }

    void logError(@NonNull Exception exc);

    default void logTemplateError(@NonNull Exception exc, @NonNull String str) {
        logError(exc);
    }
}
