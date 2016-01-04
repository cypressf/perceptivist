package com.cypressf.perceptivist.models;

import android.graphics.Color;

/**
 * The model for a mood. All moods have a name, a description, a pleasantness, and an energy.
 *
 * Pleasantness is a ranking of the emotion's pleasantness from 1 (very negative) to 10 (very positive).
 * Energy is a ranking of the emotions energy from 1 (very passive) to 10 (very active).
 */
public class Mood {

    private static final String[] NAMES = new String[] {
        "enraged",
        "panicked",
        "stressed",
        "jittery",
        "shocked",
        "surprised",
        "upbeat",
        "festive",
        "exhilarated",
        "ecstatic",
        "livid",
        "furious",
        "frustrated",
        "tense",
        "stunned",
        "hyper",
        "cheerful",
        "motivated",
        "inspired",
        "elated",
        "fuming",
        "frightened",
        "angry",
        "nervous",
        "restless",
        "energized",
        "lively",
        "enthusiastic",
        "optimistic",
        "excited",
        "anxious",
        "apprehensive",
        "worried",
        "irritated",
        "annoyed",
        "pleased",
        "happy",
        "focused",
        "proud",
        "thrilled",
        "repulsed",
        "troubled",
        "concerned",
        "uneasy",
        "peeved",
        "pleasant",
        "joyful",
        "hopeful",
        "playful",
        "blissful",
        "disgusted",
        "glum",
        "disappointed",
        "down",
        "apathetic",
        "at ease",
        "easygoing",
        "content",
        "loving",
        "fulfilled",
        "pessimistic",
        "morose",
        "discouraged",
        "sad",
        "bored",
        "calm",
        "secure",
        "satisfied",
        "grateful",
        "touched",
        "alienated",
        "miserable",
        "lonely",
        "disheartened",
        "tired",
        "relaxed",
        "chill",
        "restful",
        "blessed",
        "balanced",
        "despondent",
        "depressed",
        "sullen",
        "exhausted",
        "fatigued",
        "mellow",
        "thoughtful",
        "peaceful",
        "comfy",
        "carefree",
        "despair",
        "hopeless",
        "desolate",
        "spent",
        "drained",
        "sleepy",
        "complacent",
        "tranquil",
        "cozy",
        "serene"
    };
    private static final String[] DESCRIPTIONS = new String[] {
        "Made furious by something; filled with extreme anger",
        "Feeling overpowered by fear",
        "Feeling exhausted, tense, and strained",
        "Feeling on edge and jumpy",
        "feeling fearful that something bad is happening",
        "Feeling excited about something that happened unexpectedly",
        "Feeling optimistic and bubbly",
        "Feeling cheerful and jolly",
        "Feeling vibrant and in high spirits; wanting to enliven others",
        "Feeling the greatest amount of joy or happiness",
        "Feeling extremely furious",
        "Full of extreme or wild anger",
        "Feeling negative and discouraged because you are blocked from doing something",
        "Unable to relax, physically, mentally, or both",
        "Feeling confused or astounded by an event or behavior",
        "Feeling energetic and like you want to move or jump around",
        "Full of good spirits",
        "Enthusiastic about doing something",
        "Full of an animating and exalting influence",
        "Very joyful and proud",
        "Feeling extremely angry and as if your head is 'smoking'",
        "Afraid or fearful",
        "Very upset about a perceived injustice or blocked goal",
        "Worried about the future or an uncertain event",
        "Feeling uneasy in the mind and body",
        "Feeling wide awake and ready to get up and go",
        "Feeling full of life and energy",
        "Feeling strongly about wanting to do something",
        "Hopeful and confident that good things will happen in the future",
        "Having strong feelings about something good that's about to happen",
        "Troubled or deeply concerned about an uncertain event",
        "Fearing something that may happen in the future",
        "Thinking about something bad that may happen",
        "Annoyed or exasperated by an action or event",
        "Irritated or troubled by something that you don't like",
        "Feeling content and happy about a particular situation or person",
        "Full of pleasure",
        "Full of purpose or interest",
        "Feeling positive about yourself because you did something well",
        "Feeling filled with sudden intense excitement",
        "Feeling disgusted by somebody",
        "Feeling or showing uncomfortable feelings; uncertain",
        "Wondering if someone or something is okay or going to work out",
        "Vague sense that something is wrong",
        "Slightly irritated about something that happened or at someone",
        "Feeling delight and satisfaction",
        "Full of satisfaction and positive feelings",
        "Feeling expectant of something you desire; optimistic about the future",
        "Feeling happy and lighthearted and creative",
        "Feeling deeply pleased and perfectly happy",
        "Feeling a strong dislike of someone or something",
        "Feeling down and negative; pessimistic about future events",
        "Sad and 'blue' because something did not happen the way you wanted it to",
        "Feeling sad and like you have little energy",
        "Feeling a lack of enthusiasm and bored",
        "Feeling content and comfortable",
        "Feeling complacent and calm",
        "Satisfied with what you have, not wanting more",
        "Feeling affectionate; showing great compassion for others",
        "Feeling like you have accomplished important personal goals",
        "Expecting the worst to happen",
        "Feeling sad and gloomy",
        "Lacking the confidence to do something",
        "Feeling unhappy about something",
        "Tired of or lacking interest in something or someone",
        "Feeling free of stress and agitation",
        "Feeling safe and protected",
        "Pleased with what you have or with something you did",
        "Feeling pleased and agreeable about a certain event",
        "Feeling moved by someone or something",
        "Feeling like you have been made a stranger to others; left out and excluded",
        "Feeling extremely upset/sad/sorrowful about something or someone",
        "Feeling sad because you are by yourself and not with others",
        "Feeling discouraged and dispirited",
        "Feeling physically depleted and in need of rest",
        "When your body feels loose and calm",
        "Feeling relaxed and at ease",
        "Feeling peaceful and quiet",
        "Feeling thankful and fortunate for what you have",
        "Feeling healthy and together",
        "Feeling extreme hopelessness; loss of confidence",
        "Feeling extreme unhappiness and sadness/ down in the dumps",
        "Silently expressing a bad mood",
        "Feeling worn out and depleted of all energy",
        "Feeling extreme exhaustion; physically drained",
        "Relaxed and laid back; easygoing",
        "Thinking about the needs of others",
        "Quiet and calm and like nothing is bothering you",
        "Feeling reassured and comfortable both in mind and body",
        "Feeling free of worry and lighthearted",
        "The feeling that you are completely hopeless",
        "Feeling upset and defeated; in despair about the future",
        "Feeling empty and alone",
        "Feeling extremely exhausted, both in body and mind",
        "Feeling emotionally depleted",
        "Feeling physically tired; lacking energy",
        "Feeling pleased and in a state of 'ease'",
        "Peaceful, serene, and free from problems",
        "Feeling comfortable, warm and pleasant",
        "Calm and peaceful; untroubled"
    };
    private static Mood[] moods;
    private int pleasantness;
    private int energy;
    private String name;
    private String description;
    private Category category;
    /**
     * The constructor is private because we only use a list of predefined emotions.
     */
    private Mood(String name, String description, int pleasantness, int energy) {
        this.name = name;
        this.description = description;
        this.pleasantness = pleasantness;
        this.energy = energy;
    }

    public static Mood[] getMoods() {
        if (moods == null) {
            moods = new Mood[100];
            for (int i = 0; i < NAMES.length; i++) {
                int energy = 9 - (i / 10);
                int pleasantness = i % 10;
                moods[i] = new Mood(NAMES[i], DESCRIPTIONS[i], pleasantness, energy);
            }
        }
        return moods;
    }

    public int getColor() {
        return getCategory().color;
    }

    public Category getCategory() {
        if (category != null) {
            return category;
        }
        if (energy >= 5) {
            if (pleasantness >= 5) {
                category = Category.HAPPY;
            } else {
                category = Category.MAD;
            }
        } else {
            if (pleasantness >= 5) {
                category = Category.CALM;
            } else {
                category = Category.SAD;
            }
        }
        return category;
    }

    @Override
    public String toString() {
        return String.format("%d,%d", energy, pleasantness);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public enum Category {
        MAD (Color.RED),
        SAD (Color.BLUE),
        CALM (Color.GREEN),
        HAPPY (Color.YELLOW);
        private final int color;

        Category(int color) {
            this.color = color;
        }
    }
}
