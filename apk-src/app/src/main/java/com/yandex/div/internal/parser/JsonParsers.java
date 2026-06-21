package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import bg.a;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class JsonParsers {

    @NonNull
    private static final ValueValidator<?> ALWAYS_VALID = new a(19);

    @NonNull
    private static final ValueValidator<String> ALWAYS_VALID_STRING = new a(20);

    @NonNull
    private static final ListValidator<?> ALWAYS_VALID_LIST = new a(21);

    @NonNull
    private static final Function1<?, ?> AS_IS = new ch.a(0);

    @NonNull
    public static <T> ValueValidator<T> alwaysValid() {
        return (ValueValidator<T>) ALWAYS_VALID;
    }

    @NonNull
    public static <T> Function1<T, T> doNotConvert() {
        return (Function1<T, T>) AS_IS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$1(String str) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$2(List list) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$3(Object obj) {
        return obj;
    }
}
