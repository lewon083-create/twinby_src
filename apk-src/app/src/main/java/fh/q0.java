package fh;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import io.sentry.metrics.MetricsUnit;
import io.sentry.protocol.Device;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q0 implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18141a;

    public /* synthetic */ q0(int i) {
        this.f18141a = i;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        switch (this.f18141a) {
            case 0:
                JSONObject jSONObject = (JSONObject) obj;
                TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
                Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "bottom", typeHelper, function1, t0.f18606e, t0.f18602a);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, RRWebVideoEvent.JsonKeys.LEFT, typeHelper, function1, t0.f18607f, t0.f18603b);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "right", typeHelper, function1, t0.f18608g, t0.f18604c);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, RRWebVideoEvent.JsonKeys.TOP, typeHelper, function1, t0.f18609h, t0.f18605d);
                return new p0();
            case 1:
                JSONObject jSONObject2 = (JSONObject) obj;
                TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject2, "description", typeHelper2);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject2, "hint", typeHelper2);
                TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
                Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject2, "is_checked", typeHelper3, function12);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject2, "mode", z0.f19192c, v0.f18719g, z0.f19190a);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject2, "mute_after_action", typeHelper3, function12, z0.f19191b);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject2, "state_description", typeHelper2);
                return new y0();
            case 2:
                JSONObject jSONObject3 = (JSONObject) obj;
                TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
                JsonExpressionParser.readExpression(parsingContext, jSONObject3, "name", typeHelper4);
                JsonExpressionParser.readExpression(parsingContext, jSONObject3, "value", typeHelper4);
                return new g8.g(25);
            case 3:
                JsonExpressionParser.readExpression(parsingContext, (JSONObject) obj, MetricsUnit.Fraction.RATIO, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, j6.f17462c);
                return new p7();
            case 4:
                JSONObject jSONObject4 = (JSONObject) obj;
                TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
                Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject4, "bottom-left", typeHelper5, function13, j6.f17467h);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject4, "bottom-right", typeHelper5, function13, j6.i);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject4, "top-left", typeHelper5, function13, j6.f17468j);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject4, "top-right", typeHelper5, function13, j6.f17469k);
                return new ga();
            case 5:
                JSONObject jSONObject5 = (JSONObject) obj;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject5, "unit", jb.f17487b, hn.f17349o, jb.f17486a);
                JsonExpressionParser.readExpression(parsingContext, jSONObject5, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE);
                return new ib();
            case 6:
                JSONObject jSONObject6 = (JSONObject) obj;
                TypeHelper<Long> typeHelper6 = TypeHelpersKt.TYPE_HELPER_INT;
                Function1<Number, Long> function14 = ParsingConvertersKt.NUMBER_TO_INT;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject6, "bottom", typeHelper6, function14, ub.f18683g, ub.f18677a);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject6, "end", typeHelper6, function14, ub.f18684h);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject6, RRWebVideoEvent.JsonKeys.LEFT, typeHelper6, function14, ub.i, ub.f18678b);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject6, "right", typeHelper6, function14, ub.f18685j, ub.f18679c);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject6, "start", typeHelper6, function14, ub.f18686k);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject6, RRWebVideoEvent.JsonKeys.TOP, typeHelper6, function14, ub.f18687l, ub.f18680d);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject6, "unit", ub.f18682f, hn.f17349o, ub.f18681e);
                return new tb();
            case 7:
                JSONObject jSONObject7 = (JSONObject) obj;
                return new wd.d();
            case 8:
                JSONObject jSONObject8 = (JSONObject) obj;
                TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
                JsonExpressionParser.readExpression(parsingContext, jSONObject8, "key", typeHelper7, zc.f19211b);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject8, "placeholder", typeHelper7, zc.f19212c, zc.f19210a);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject8, "regex", typeHelper7);
                return new sc();
            case 9:
                JSONObject jSONObject9 = (JSONObject) obj;
                TypeHelper<String> typeHelper8 = TypeHelpersKt.TYPE_HELPER_STRING;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject9, "down", typeHelper8);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject9, "forward", typeHelper8);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject9, RRWebVideoEvent.JsonKeys.LEFT, typeHelper8);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject9, "right", typeHelper8);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject9, "up", typeHelper8);
                return new id();
            case 10:
                JSONObject jSONObject10 = (JSONObject) obj;
                return new nd();
            case 11:
                JsonExpressionParser.readExpression(parsingContext, (JSONObject) obj, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
                return new wf();
            case 12:
                JSONObject jSONObject11 = (JSONObject) obj;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject11, "allow_empty", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, bh.f16942a);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject11, "label_id", TypeHelpersKt.TYPE_HELPER_STRING);
                return new ah();
            case 13:
                JSONObject jSONObject12 = (JSONObject) obj;
                return new vh();
            case 14:
                JSONObject jSONObject13 = (JSONObject) obj;
                JsonExpressionParser.readExpression(parsingContext, jSONObject13, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
                JsonExpressionParser.readExpression(parsingContext, jSONObject13, "position", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, j6.f17472n);
                return new of();
            case 15:
                JsonExpressionParser.readExpression(parsingContext, (JSONObject) obj, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, j6.f17474p);
                return new qk();
            case 16:
                JSONObject jSONObject14 = (JSONObject) obj;
                JsonExpressionParser.readExpression(parsingContext, jSONObject14, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
                JsonExpressionParser.readExpression(parsingContext, jSONObject14, "position", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, j6.f17475q);
                return new of();
            case 17:
                JSONObject jSONObject15 = (JSONObject) obj;
                TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject15, "text", typeHelper9);
                JsonExpressionParser.readExpression(parsingContext, jSONObject15, "value", typeHelper9);
                return new of();
            case 18:
                JSONObject jSONObject16 = (JSONObject) obj;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject16, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, rn.f18251a);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject16, Device.JsonKeys.ORIENTATION, rn.f18253c, hn.f17344j, rn.f18252b);
                return new pn();
            case 19:
                JSONObject jSONObject17 = (JSONObject) obj;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject17, "unit", to.f18658b, hn.f17349o, to.f18657a);
                JsonExpressionParser.readExpression(parsingContext, jSONObject17, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, to.f18659c);
                return new so();
            case 20:
                JSONObject jSONObject18 = (JSONObject) obj;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject18, "description", TypeHelpersKt.TYPE_HELPER_STRING);
                return new ks();
            case 21:
                JsonExpressionParser.readOptionalExpression(parsingContext, (JSONObject) obj, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, nt.f18013a);
                return new mt();
            default:
                JSONObject jSONObject19 = (JSONObject) obj;
                TypeHelper<Long> typeHelper10 = TypeHelpersKt.TYPE_HELPER_INT;
                Function1<Number, Long> function15 = ParsingConvertersKt.NUMBER_TO_INT;
                JsonExpressionParser.readExpression(parsingContext, jSONObject19, "height", typeHelper10, function15, j6.f17477s);
                JsonExpressionParser.readExpression(parsingContext, jSONObject19, "width", typeHelper10, function15, j6.f17478t);
                return new tw();
        }
    }
}
