package io.sentry;

import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class JsonObjectDeserializer {
    private final ArrayList<Token> tokens = new ArrayList<>();

    /* JADX INFO: renamed from: io.sentry.JsonObjectDeserializer$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$vendor$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$io$sentry$vendor$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface NextValue {
        @Nullable
        Object nextValue();
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface Token {
        @NotNull
        Object getValue();
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class TokenName implements Token {
        final String value;

        public TokenName(@NotNull String str) {
            this.value = str;
        }

        @Override // io.sentry.JsonObjectDeserializer.Token
        @NotNull
        public Object getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class TokenPrimitive implements Token {
        final Object value;

        public TokenPrimitive(@NotNull Object obj) {
            this.value = obj;
        }

        @Override // io.sentry.JsonObjectDeserializer.Token
        @NotNull
        public Object getValue() {
            return this.value;
        }
    }

    @Nullable
    private Token getCurrentToken() {
        if (this.tokens.isEmpty()) {
            return null;
        }
        return (Token) gf.a.g(1, this.tokens);
    }

    private boolean handleArrayOrMapEnd() {
        if (hasOneToken()) {
            return true;
        }
        Token currentToken = getCurrentToken();
        popCurrentToken();
        if (!(getCurrentToken() instanceof TokenName)) {
            if (!(getCurrentToken() instanceof TokenArray)) {
                return false;
            }
            TokenArray tokenArray = (TokenArray) getCurrentToken();
            if (currentToken == null || tokenArray == null) {
                return false;
            }
            tokenArray.value.add(currentToken.getValue());
            return false;
        }
        TokenName tokenName = (TokenName) getCurrentToken();
        popCurrentToken();
        TokenMap tokenMap = (TokenMap) getCurrentToken();
        if (tokenName == null || currentToken == null || tokenMap == null) {
            return false;
        }
        tokenMap.value.put(tokenName.value, currentToken.getValue());
        return false;
    }

    private boolean handlePrimitive(NextValue nextValue) {
        Object objNextValue = nextValue.nextValue();
        if (getCurrentToken() == null && objNextValue != null) {
            pushCurrentToken(new TokenPrimitive(objNextValue));
            return true;
        }
        if (getCurrentToken() instanceof TokenName) {
            TokenName tokenName = (TokenName) getCurrentToken();
            popCurrentToken();
            ((TokenMap) getCurrentToken()).value.put(tokenName.value, objNextValue);
            return false;
        }
        if (!(getCurrentToken() instanceof TokenArray)) {
            return false;
        }
        ((TokenArray) getCurrentToken()).value.add(objNextValue);
        return false;
    }

    private boolean hasOneToken() {
        return this.tokens.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$parse$2(JsonObjectReader jsonObjectReader) {
        return Boolean.valueOf(jsonObjectReader.nextBoolean());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$parse$3() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: nextNumber, reason: merged with bridge method [inline-methods] */
    public Object lambda$parse$1(JsonObjectReader jsonObjectReader) {
        try {
            try {
                return Integer.valueOf(jsonObjectReader.nextInt());
            } catch (Exception unused) {
                return Long.valueOf(jsonObjectReader.nextLong());
            }
        } catch (Exception unused2) {
            return Double.valueOf(jsonObjectReader.nextDouble());
        }
    }

    private void parse(@NotNull final JsonObjectReader jsonObjectReader) {
        boolean zHandleArrayOrMapEnd = false;
        while (!zHandleArrayOrMapEnd) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$io$sentry$vendor$gson$stream$JsonToken[jsonObjectReader.peek().ordinal()]) {
                case 1:
                    jsonObjectReader.beginArray();
                    pushCurrentToken(new TokenArray(anonymousClass1));
                    break;
                case 2:
                    jsonObjectReader.endArray();
                    zHandleArrayOrMapEnd = handleArrayOrMapEnd();
                    break;
                case 3:
                    jsonObjectReader.beginObject();
                    pushCurrentToken(new TokenMap(anonymousClass1));
                    break;
                case 4:
                    jsonObjectReader.endObject();
                    zHandleArrayOrMapEnd = handleArrayOrMapEnd();
                    break;
                case 5:
                    pushCurrentToken(new TokenName(jsonObjectReader.nextName()));
                    break;
                case 6:
                    final int i = 0;
                    zHandleArrayOrMapEnd = handlePrimitive(new NextValue() { // from class: io.sentry.d
                        @Override // io.sentry.JsonObjectDeserializer.NextValue
                        public final Object nextValue() {
                            switch (i) {
                                case 0:
                                    return jsonObjectReader.nextString();
                                default:
                                    return JsonObjectDeserializer.lambda$parse$2(jsonObjectReader);
                            }
                        }
                    });
                    break;
                case 7:
                    zHandleArrayOrMapEnd = handlePrimitive(new e(0, this, jsonObjectReader));
                    break;
                case 8:
                    final int i10 = 1;
                    zHandleArrayOrMapEnd = handlePrimitive(new NextValue() { // from class: io.sentry.d
                        @Override // io.sentry.JsonObjectDeserializer.NextValue
                        public final Object nextValue() {
                            switch (i10) {
                                case 0:
                                    return jsonObjectReader.nextString();
                                default:
                                    return JsonObjectDeserializer.lambda$parse$2(jsonObjectReader);
                            }
                        }
                    });
                    break;
                case 9:
                    jsonObjectReader.nextNull();
                    zHandleArrayOrMapEnd = handlePrimitive(new f(0));
                    break;
                case 10:
                    zHandleArrayOrMapEnd = true;
                    break;
            }
        }
    }

    private void popCurrentToken() {
        if (this.tokens.isEmpty()) {
            return;
        }
        this.tokens.remove(r0.size() - 1);
    }

    private void pushCurrentToken(Token token) {
        this.tokens.add(token);
    }

    @Nullable
    public Object deserialize(@NotNull JsonObjectReader jsonObjectReader) {
        parse(jsonObjectReader);
        Token currentToken = getCurrentToken();
        if (currentToken != null) {
            return currentToken.getValue();
        }
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class TokenArray implements Token {
        final ArrayList<Object> value;

        private TokenArray() {
            this.value = new ArrayList<>();
        }

        @Override // io.sentry.JsonObjectDeserializer.Token
        @NotNull
        public Object getValue() {
            return this.value;
        }

        public /* synthetic */ TokenArray(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class TokenMap implements Token {
        final HashMap<String, Object> value;

        private TokenMap() {
            this.value = new HashMap<>();
        }

        @Override // io.sentry.JsonObjectDeserializer.Token
        @NotNull
        public Object getValue() {
            return this.value;
        }

        public /* synthetic */ TokenMap(AnonymousClass1 anonymousClass1) {
            this();
        }
    }
}
