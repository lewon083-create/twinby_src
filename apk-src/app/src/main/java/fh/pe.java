package fh;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import io.sentry.protocol.ViewHierarchyNode;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pe implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18094a;

    public pe(sy syVar) {
        this.f18094a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final oe deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, se.i, se.f18304a);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", se.f18309f, v0.f18733v, se.f18305b);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", se.f18310g, v0.f18734w, se.f18306c);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "filters", this.f18094a.f18434j3);
        JsonExpressionParser.readExpression(parsingContext, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, se.f18307d);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", se.f18311h, be.f16940z, se.f18308e);
        return new oe();
    }
}
