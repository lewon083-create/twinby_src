package io.flutter.view;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum e {
    TAP(1),
    LONG_PRESS(2),
    SCROLL_LEFT(4),
    SCROLL_RIGHT(8),
    SCROLL_UP(16),
    SCROLL_DOWN(32),
    INCREASE(64),
    DECREASE(128),
    SHOW_ON_SCREEN(256),
    MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
    MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
    SET_SELECTION(2048),
    COPY(4096),
    CUT(8192),
    PASTE(16384),
    DID_GAIN_ACCESSIBILITY_FOCUS(32768),
    DID_LOSE_ACCESSIBILITY_FOCUS(65536),
    CUSTOM_ACTION(131072),
    DISMISS(262144),
    MOVE_CURSOR_FORWARD_BY_WORD(524288),
    MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
    SET_TEXT(2097152),
    /* JADX INFO: Fake field, exist only in values array */
    FOCUS(4194304),
    /* JADX INFO: Fake field, exist only in values array */
    SCROLL_TO_OFFSET(8388608),
    EXPAND(16777216),
    COLLAPSE(33554432);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25811b;

    e(int i) {
        this.f25811b = i;
    }
}
